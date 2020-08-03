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

import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttributeResponse;
import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttributeResponse.Data;
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
		extractPedestrianFeatureAttributeResponse.setData(data);
	 
	 	return extractPedestrianFeatureAttributeResponse;
	}
}