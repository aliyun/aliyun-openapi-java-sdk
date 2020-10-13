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

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("PedestrianDetectAttributeResponse.Data.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();

			Age age = new Age();
			age.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Age.Name"));
			age.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Age.Score"));
			attributesItem.setAge(age);

			Backpack backpack = new Backpack();
			backpack.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Backpack.Name"));
			backpack.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Backpack.Score"));
			attributesItem.setBackpack(backpack);

			Gender gender = new Gender();
			gender.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Gender.Name"));
			gender.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Gender.Score"));
			attributesItem.setGender(gender);

			Glasses glasses = new Glasses();
			glasses.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Glasses.Name"));
			glasses.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Glasses.Score"));
			attributesItem.setGlasses(glasses);

			Handbag handbag = new Handbag();
			handbag.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Handbag.Name"));
			handbag.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Handbag.Score"));
			attributesItem.setHandbag(handbag);

			Hat hat = new Hat();
			hat.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Hat.Name"));
			hat.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Hat.Score"));
			attributesItem.setHat(hat);

			LowerColor lowerColor = new LowerColor();
			lowerColor.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerColor.Name"));
			lowerColor.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerColor.Score"));
			attributesItem.setLowerColor(lowerColor);

			LowerWear lowerWear = new LowerWear();
			lowerWear.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerWear.Name"));
			lowerWear.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].LowerWear.Score"));
			attributesItem.setLowerWear(lowerWear);

			Orient orient = new Orient();
			orient.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Orient.Name"));
			orient.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].Orient.Score"));
			attributesItem.setOrient(orient);

			ShoulderBag shoulderBag = new ShoulderBag();
			shoulderBag.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].ShoulderBag.Name"));
			shoulderBag.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].ShoulderBag.Score"));
			attributesItem.setShoulderBag(shoulderBag);

			UpperColor upperColor = new UpperColor();
			upperColor.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperColor.Name"));
			upperColor.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperColor.Score"));
			attributesItem.setUpperColor(upperColor);

			UpperWear upperWear = new UpperWear();
			upperWear.setName(_ctx.stringValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperWear.Name"));
			upperWear.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Attributes["+ i +"].UpperWear.Score"));
			attributesItem.setUpperWear(upperWear);

			attributes.add(attributesItem);
		}
		data.setAttributes(attributes);

		List<BoxesItem> boxes = new ArrayList<BoxesItem>();
		for (int i = 0; i < _ctx.lengthValue("PedestrianDetectAttributeResponse.Data.Boxes.Length"); i++) {
			BoxesItem boxesItem = new BoxesItem();
			boxesItem.setScore(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].Score"));
			boxesItem.setTopLeftX(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].TopLeftX"));
			boxesItem.setTopLeftY(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].TopLeftY"));
			boxesItem.setBottomRightX(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].BottomRightX"));
			boxesItem.setBottomRightY(_ctx.floatValue("PedestrianDetectAttributeResponse.Data.Boxes["+ i +"].BottomRightY"));

			boxes.add(boxesItem);
		}
		data.setBoxes(boxes);
		pedestrianDetectAttributeResponse.setData(data);
	 
	 	return pedestrianDetectAttributeResponse;
	}
}