/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 20/12/2013 7:57:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.ModInterface;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelDynamo extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape2g;
	LODModelPart Shape2h;
	LODModelPart Shape2u;
	LODModelPart Shape2j;
	LODModelPart Shape2i;
	LODModelPart Shape2k;
	LODModelPart Shape2l;
	LODModelPart Shape2m;
	LODModelPart Shape2n;
	LODModelPart Shape2o;
	LODModelPart Shape2p;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape5g;
	LODModelPart Shape5h;
	LODModelPart Shape5i;
	LODModelPart Shape5j;
	LODModelPart Shape5k;
	LODModelPart Shape4a;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape8;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape8a;
	LODModelPart Shape9;
	LODModelPart Shape9a;
	LODModelPart Shape10;
	LODModelPart Shape10a;
	LODModelPart Shape11;
	LODModelPart Shape11a;
	LODModelPart Shape12;
	LODModelPart Shape12a;
	LODModelPart Shape13;
	LODModelPart Shape13a;
	LODModelPart Shape14;
	LODModelPart Shape14a;

	public ModelDynamo()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 21);
		Shape1.addBox(-1F, -1F, 0F, 2, 2, 17);
		Shape1.setRotationPoint(0F, 15F, -8.5F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.7853982F);
		Shape1a = new LODModelPart(this, 0, 21);
		Shape1a.addBox(-1F, -1F, 0F, 2, 2, 17);
		Shape1a.setRotationPoint(0F, 15F, -8.5F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 88);
		Shape2.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2.setRotationPoint(0F, 15F, -4.9F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0.3490659F);
		Shape2a = new LODModelPart(this, 0, 88);
		Shape2a.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2a.setRotationPoint(0F, 15F, -5F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, -2.792527F);
		Shape2b = new LODModelPart(this, 0, 88);
		Shape2b.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2b.setRotationPoint(0F, 15F, -5.1F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 3.141593F);
		Shape2c = new LODModelPart(this, 0, 88);
		Shape2c.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2c.setRotationPoint(0F, 15F, -5F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 2.792527F);
		Shape2d = new LODModelPart(this, 0, 88);
		Shape2d.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2d.setRotationPoint(0F, 15F, -5.1F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 2.443461F);
		Shape2e = new LODModelPart(this, 0, 88);
		Shape2e.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2e.setRotationPoint(0F, 15F, -5F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 2.094395F);
		Shape2f = new LODModelPart(this, 0, 88);
		Shape2f.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2f.setRotationPoint(0F, 15F, -5.1F);
		Shape2f.setTextureSize(128, 128);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 1.745329F);
		Shape2g = new LODModelPart(this, 0, 88);
		Shape2g.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2g.setRotationPoint(0F, 15F, -5F);
		Shape2g.setTextureSize(128, 128);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, 1.396263F);
		Shape2h = new LODModelPart(this, 0, 88);
		Shape2h.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2h.setRotationPoint(0F, 15F, -5.1F);
		Shape2h.setTextureSize(128, 128);
		Shape2h.mirror = true;
		this.setRotation(Shape2h, 0F, 0F, 1.047198F);
		Shape2u = new LODModelPart(this, 0, 88);
		Shape2u.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2u.setRotationPoint(0F, 15F, -5F);
		Shape2u.setTextureSize(128, 128);
		Shape2u.mirror = true;
		this.setRotation(Shape2u, 0F, 0F, 0.6981317F);
		Shape2j = new LODModelPart(this, 0, 88);
		Shape2j.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2j.setRotationPoint(0F, 15F, -5F);
		Shape2j.setTextureSize(128, 128);
		Shape2j.mirror = true;
		this.setRotation(Shape2j, 0F, 0F, 0F);
		Shape2i = new LODModelPart(this, 0, 88);
		Shape2i.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2i.setRotationPoint(0F, 15F, -4.9F);
		Shape2i.setTextureSize(128, 128);
		Shape2i.mirror = true;
		this.setRotation(Shape2i, 0F, 0F, -0.3490659F);
		Shape2k = new LODModelPart(this, 0, 88);
		Shape2k.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2k.setRotationPoint(0F, 15F, -5F);
		Shape2k.setTextureSize(128, 128);
		Shape2k.mirror = true;
		this.setRotation(Shape2k, 0F, 0F, -0.6981317F);
		Shape2l = new LODModelPart(this, 0, 88);
		Shape2l.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2l.setRotationPoint(0F, 15F, -5.1F);
		Shape2l.setTextureSize(128, 128);
		Shape2l.mirror = true;
		this.setRotation(Shape2l, 0F, 0F, -1.047198F);
		Shape2m = new LODModelPart(this, 0, 88);
		Shape2m.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2m.setRotationPoint(0F, 15F, -5F);
		Shape2m.setTextureSize(128, 128);
		Shape2m.mirror = true;
		this.setRotation(Shape2m, 0F, 0F, -1.396263F);
		Shape2n = new LODModelPart(this, 0, 88);
		Shape2n.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2n.setRotationPoint(0F, 15F, -5.1F);
		Shape2n.setTextureSize(128, 128);
		Shape2n.mirror = true;
		this.setRotation(Shape2n, 0F, 0F, -1.745329F);
		Shape2o = new LODModelPart(this, 0, 88);
		Shape2o.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2o.setRotationPoint(0F, 15F, -5F);
		Shape2o.setTextureSize(128, 128);
		Shape2o.mirror = true;
		this.setRotation(Shape2o, 0F, 0F, -2.094395F);
		Shape2p = new LODModelPart(this, 0, 88);
		Shape2p.addBox(-2F, -8F, 0F, 4, 5, 1);
		Shape2p.setRotationPoint(0F, 15F, -5.1F);
		Shape2p.setTextureSize(128, 128);
		Shape2p.mirror = true;
		this.setRotation(Shape2p, 0F, 0F, -2.443461F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape3.setRotationPoint(-8F, 23F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 65, 0);
		Shape4.addBox(0F, 0F, 0F, 4, 10, 1);
		Shape4.setRotationPoint(-2F, 13F, 6.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 56);
		Shape5.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5.setRotationPoint(0F, 15F, -4.7F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, -2.617994F);
		Shape5a = new LODModelPart(this, 0, 56);
		Shape5a.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5a.setRotationPoint(0F, 15F, -4.7F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new LODModelPart(this, 0, 56);
		Shape5b.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5b.setRotationPoint(0F, 15F, -4.7F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0.5235988F);
		Shape5c = new LODModelPart(this, 0, 56);
		Shape5c.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5c.setRotationPoint(0F, 15F, -4.7F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 1.047198F);
		Shape5d = new LODModelPart(this, 0, 56);
		Shape5d.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5d.setRotationPoint(0F, 15F, -4.766667F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 1.570796F);
		Shape5e = new LODModelPart(this, 0, 56);
		Shape5e.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5e.setRotationPoint(0F, 15F, -4.7F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 2.094395F);
		Shape5f = new LODModelPart(this, 0, 56);
		Shape5f.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5f.setRotationPoint(0F, 15F, -4.7F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 2.617994F);
		Shape5g = new LODModelPart(this, 0, 56);
		Shape5g.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5g.setRotationPoint(0F, 15F, -4.7F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, 3.141593F);
		Shape5h = new LODModelPart(this, 0, 56);
		Shape5h.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5h.setRotationPoint(0F, 15F, -4.7F);
		Shape5h.setTextureSize(128, 128);
		Shape5h.mirror = true;
		this.setRotation(Shape5h, 0F, 0F, -0.5235988F);
		Shape5i = new LODModelPart(this, 0, 56);
		Shape5i.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5i.setRotationPoint(0F, 15F, -4.7F);
		Shape5i.setTextureSize(128, 128);
		Shape5i.mirror = true;
		this.setRotation(Shape5i, 0F, 0F, -1.047198F);
		Shape5j = new LODModelPart(this, 0, 56);
		Shape5j.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5j.setRotationPoint(0F, 15F, -4.7F);
		Shape5j.setTextureSize(128, 128);
		Shape5j.mirror = true;
		this.setRotation(Shape5j, 0F, 0F, -1.570796F);
		Shape5k = new LODModelPart(this, 0, 56);
		Shape5k.addBox(-0.5F, -7.5F, 0F, 1, 4, 1);
		Shape5k.setRotationPoint(0F, 15F, -4.7F);
		Shape5k.setTextureSize(128, 128);
		Shape5k.mirror = true;
		this.setRotation(Shape5k, 0F, 0F, -2.094395F);
		Shape4a = new LODModelPart(this, 65, 0);
		Shape4a.addBox(0F, 0F, 0F, 4, 10, 1);
		Shape4a.setRotationPoint(-2F, 13F, -7.5F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 122, 0);
		Shape6.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape6.setRotationPoint(0F, 15F, -5.5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 2.094395F);
		Shape6a = new LODModelPart(this, 122, 0);
		Shape6a.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape6a.setRotationPoint(0F, 15F, -5.5F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 122, 0);
		Shape6b.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape6b.setRotationPoint(0F, 15F, -5.5F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 1.047198F);
		Shape7 = new LODModelPart(this, 89, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7.setRotationPoint(5.5F, 14F, -4.2F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 89, 0);
		Shape7a.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7a.setRotationPoint(3.5F, 14F, -4.2F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 77, 0);
		Shape8.addBox(0F, 0F, 0F, 4, 8, 1);
		Shape8.setRotationPoint(3F, 15F, -4F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape7b = new LODModelPart(this, 89, 0);
		Shape7b.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7b.setRotationPoint(-4.5F, 14F, -4.2F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new LODModelPart(this, 89, 0);
		Shape7c.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7c.setRotationPoint(-6.5F, 14F, -4.2F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape8a = new LODModelPart(this, 77, 0);
		Shape8a.addBox(0F, 0F, 0F, 4, 8, 1);
		Shape8a.setRotationPoint(-7F, 15F, -4F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 104, 9);
		Shape9.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape9.setRotationPoint(-8F, 15F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape9a = new LODModelPart(this, 104, 0);
		Shape9a.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape9a.setRotationPoint(7F, 15F, 0F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 0, 52);
		Shape10.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape10.setRotationPoint(-2F, 17F, -1F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape10a = new LODModelPart(this, 0, 48);
		Shape10a.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape10a.setRotationPoint(-2F, 12F, -1F);
		Shape10a.setTextureSize(128, 128);
		Shape10a.mirror = true;
		this.setRotation(Shape10a, 0F, 0F, 0F);
		Shape11 = new LODModelPart(this, 115, 7);
		Shape11.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape11.setRotationPoint(-3F, 13F, -1F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11a = new LODModelPart(this, 115, 0);
		Shape11a.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape11a.setRotationPoint(2F, 13F, -1F);
		Shape11a.setTextureSize(128, 128);
		Shape11a.mirror = true;
		this.setRotation(Shape11a, 0F, 0F, 0F);
		Shape12 = new LODModelPart(this, 0, 42);
		Shape12.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape12.setRotationPoint(-7F, 14F, -1F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12a = new LODModelPart(this, 0, 42);
		Shape12a.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape12a.setRotationPoint(3F, 14F, -1F);
		Shape12a.setTextureSize(128, 128);
		Shape12a.mirror = true;
		this.setRotation(Shape12a, 0F, 0F, 0F);
		Shape13 = new LODModelPart(this, 94, 0);
		Shape13.addBox(0F, 0F, 0F, 1, 10, 3);
		Shape13.setRotationPoint(-6F, 13F, -1.5F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0F, 0F, 0F);
		Shape13a = new LODModelPart(this, 94, 0);
		Shape13a.addBox(0F, 0F, 0F, 1, 10, 3);
		Shape13a.setRotationPoint(5F, 13F, -1.5F);
		Shape13a.setTextureSize(128, 128);
		Shape13a.mirror = true;
		this.setRotation(Shape13a, 0F, 0F, 0F);
		Shape14 = new LODModelPart(this, 0, 72);
		Shape14.addBox(0F, 0F, 0F, 1, 3, 4);
		Shape14.setRotationPoint(-5.5F, 17F, -3.5F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape14a = new LODModelPart(this, 0, 63);
		Shape14a.addBox(0F, 0F, 0F, 1, 3, 4);
		Shape14a.setRotationPoint(4.5F, 17F, -3.5F);
		Shape14a.setTextureSize(128, 128);
		Shape14a.mirror = true;
		this.setRotation(Shape14a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape2g.render(te, f5);
		Shape2h.render(te, f5);
		Shape2u.render(te, f5);
		Shape2j.render(te, f5);
		Shape2i.render(te, f5);
		Shape2k.render(te, f5);
		Shape2l.render(te, f5);
		Shape2m.render(te, f5);
		Shape2n.render(te, f5);
		Shape2o.render(te, f5);
		Shape2p.render(te, f5);

		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape5b.render(te, f5);
		Shape5c.render(te, f5);
		Shape5d.render(te, f5);
		Shape5e.render(te, f5);
		Shape5f.render(te, f5);
		Shape5g.render(te, f5);
		Shape5h.render(te, f5);
		Shape5i.render(te, f5);
		Shape5j.render(te, f5);
		Shape5k.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape6b.render(te, f5);
		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);

		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);

		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape8.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape8a.render(te, f5);
		//Shape9.render(te, f5);
		Shape9a.render(te, f5);
		Shape10.render(te, f5);
		Shape10a.render(te, f5);
		Shape11.render(te, f5);
		Shape11a.render(te, f5);
		Shape12.render(te, f5);
		Shape12a.render(te, f5);
		Shape13.render(te, f5);
		Shape13a.render(te, f5);
		//Shape14.render(te, f5);
		Shape14a.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
