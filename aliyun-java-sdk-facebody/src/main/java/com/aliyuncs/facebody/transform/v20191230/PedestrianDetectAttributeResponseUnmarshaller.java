/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Age;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Backpack;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Gender;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Glasses;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Handbag;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Hat;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.LowerColor;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.LowerWear;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.Orient;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.ShoulderBag;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.UpperColor;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.AttributesItem.UpperWear;
import com.aliyuncs.facebody.model.v20191230.PedestrianDetectAttributeResponse.Data.BoxesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PedestrianDetectAttributeResponseUnmarshaller {

	public static PedestrianDetectAttributeResponse unmarshall(PedestrianDetectAttributeResponse pedestrianDetectAttributeResponse, UnmarshallerContext _ctx) {
		
		pedestrianDetectAttributeResponse.setRequestId(_ctx.stringValue("PedestrianDetectAttributeResponse.RequestId"));

		Data data = new Data();
		data.setPersonNumber(_ctx.integerValue("PedestrianDetectAttributeResponse.Data.PersonNumber"));
		data.setHeight(_ctx.longValue("PedestrianDetectAttributeResponse.Data.Height"));
		data.setWidth(_ctx.longValue("PedestrianDetectAttributeResponse.Data.Width"));

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("PedestrianDetectAttributeResponse.Data.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();

			Backpack backpack = new Backpack();
			backpack.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Backpack.Score"));
			backpack.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Backpack.Name"));
			attributesItem.setBackpack(backpack);

			LowerWear lowerWear = new LowerWear();
			lowerWear.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerWear.Score"));
			lowerWear.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerWear.Name"));
			attributesItem.setLowerWear(lowerWear);

			ShoulderBag shoulderBag = new ShoulderBag();
			shoulderBag.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].ShoulderBag.Score"));
			shoulderBag.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].ShoulderBag.Name"));
			attributesItem.setShoulderBag(shoulderBag);

			Orient orient = new Orient();
			orient.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Orient.Score"));
			orient.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Orient.Name"));
			attributesItem.setOrient(orient);

			LowerColor lowerColor = new LowerColor();
			lowerColor.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerColor.Score"));
			lowerColor.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerColor.Name"));
			attributesItem.setLowerColor(lowerColor);

			Glasses glasses = new Glasses();
			glasses.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Glasses.Score"));
			glasses.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Glasses.Name"));
			attributesItem.setGlasses(glasses);

			UpperColor upperColor = new UpperColor();
			upperColor.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperColor.Score"));
			upperColor.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperColor.Name"));
			attributesItem.setUpperColor(upperColor);

			Handbag handbag = new Handbag();
			handbag.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Handbag.Score"));
			handbag.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Handbag.Name"));
			attributesItem.setHandbag(handbag);

			Hat hat = new Hat();
			hat.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Hat.Score"));
			hat.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Hat.Name"));
			attributesItem.setHat(hat);

			Gender gender = new Gender();
			gender.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Gender.Score"));
			gender.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Gender.Name"));
			attributesItem.setGender(gender);

			UpperWear upperWear = new UpperWear();
			upperWear.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperWear.Score"));
			upperWear.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperWear.Name"));
			attributesItem.setUpperWear(upperWear);

			Age age = new Age();
			age.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Age.Score"));
			age.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Age.Name"));
			attributesItem.setAge(age);

			attributes.add(attributesItem);
		}
		data.setAttributes(attributes);

		List<BoxesItem> boxes = new ArrayList<BoxesItem>();
		for (int i = 0; i < _ctx.lengthValue("PedestrianDetectAttributeResponse.Data.Boxes.Length"); i++) {
			BoxesItem boxesItem = new BoxesItem();
			boxesItem.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].Score"));
			boxesItem.setBottomRightY(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].BottomRightY"));
			boxesItem.setBottomRightX(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].BottomRightX"));
			boxesItem.setTopLeftY(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].TopLeftY"));
			boxesItem.setTopLeftX(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].TopLeftX"));

			boxes.add(boxesItem);
		}
		data.setBoxes(boxes);
		pedestrianDetectAttributeResponse.setData(data);
	 
	 	return pedestrianDetectAttributeResponse;
	}
}