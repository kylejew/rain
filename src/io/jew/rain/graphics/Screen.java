package io.jew.rain.graphics;

public class Screen {
	private int width, height;
	public int[] pixels;
	
	int xtime = 50, ytime = 50;
	int counter = 0;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
				
	}
	
	public void clear() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[x + y * width] = 0x000000;
			}
		}
	}
	public void render() {
		counter++;
		if (counter % 10 == 0) xtime--;
		if (counter % 10 == 0) ytime--;
		
		for (int y = 0; y < height; y++) {
			if (ytime < 0 || ytime >= height) break;
			if (xtime < 0 || xtime >= width) break;
			for (int x = 0; x < width; x++) {
				pixels[xtime + ytime * width] = 0xff00ff;
			}
		}
	}
}
