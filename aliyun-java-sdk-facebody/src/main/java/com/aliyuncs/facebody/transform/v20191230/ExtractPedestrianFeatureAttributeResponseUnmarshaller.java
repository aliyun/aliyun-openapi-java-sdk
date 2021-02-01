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

import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttributeResponse;
import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttributeResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttributeResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExtractPedestrianFeatureAttributeResponseUnmarshaller {

	public static ExtractPedestrianFeatureAttributeResponse unmarshall(ExtractPedestrianFeatureAttributeResponse extractPedestrianFeatureAttributeResponse, UnmarshallerContext _ctx) {
		
		extractPedestrianFeatureAttributeResponse.setRequestId(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.RequestId"));

		Data data = new Data();
		data.setObjType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.ObjType"));
		data.setObjTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.ObjTypeScore"));
		data.setFeature(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Feature"));
		data.setQualityScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.QualityScore"));
		data.setUpperColor(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.UpperColor"));
		data.setUpperColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.UpperColorScore"));
		data.setUpperType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.UpperType"));
		data.setUpperTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.UpperTypeScore"));
		data.setLowerColor(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.LowerColor"));
		data.setLowerColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.LowerColorScore"));
		data.setLowerType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.LowerType"));
		data.setLowerTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.LowerTypeScore"));
		data.setGender(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Gender"));
		data.setGenderScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.GenderScore"));
		data.setHair(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Hair"));
		data.setHairScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.HairScore"));
		data.setAge(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Age"));
		data.setAgeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.AgeScore"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setObjType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].ObjType"));
			element.setObjTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].ObjTypeScore"));
			element.setFeature(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].Feature"));
			element.setQualityScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].QualityScore"));
			element.setUpperColor(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].UpperColor"));
			element.setUpperColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].UpperColorScore"));
			element.setUpperType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].UpperType"));
			element.setUpperTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].UpperTypeScore"));
			element.setLowerColor(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].LowerColor"));
			element.setLowerColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].LowerColorScore"));
			element.setLowerType(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].LowerType"));
			element.setLowerTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].LowerTypeScore"));
			element.setGender(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].Gender"));
			element.setGenderScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].GenderScore"));
			element.setHair(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].Hair"));
			element.setHairScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].HairScore"));
			element.setAge(_ctx.stringValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].Age"));
			element.setAgeScore(_ctx.floatValue("ExtractPedestrianFeatureAttributeResponse.Data.Elements["+ i +"].AgeScore"));

			elements.add(element);
		}
		data.setElements(elements);
		extractPedestrianFeatureAttributeResponse.setData(data);
	 
	 	return extractPedestrianFeatureAttributeResponse;
	}
}