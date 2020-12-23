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

import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttrResponse;
import com.aliyuncs.facebody.model.v20191230.ExtractPedestrianFeatureAttrResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExtractPedestrianFeatureAttrResponseUnmarshaller {

	public static ExtractPedestrianFeatureAttrResponse unmarshall(ExtractPedestrianFeatureAttrResponse extractPedestrianFeatureAttrResponse, UnmarshallerContext _ctx) {
		
		extractPedestrianFeatureAttrResponse.setRequestId(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.RequestId"));

		Data data = new Data();
		data.setObjType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.ObjType"));
		data.setObjTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.ObjTypeScore"));
		data.setFeature(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Feature"));
		data.setQualityScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.QualityScore"));
		data.setUpperColor(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.UpperColor"));
		data.setUpperColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.UpperColorScore"));
		data.setUpperType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.UpperType"));
		data.setUpperTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.UpperTypeScore"));
		data.setLowerColor(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.LowerColor"));
		data.setLowerColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.LowerColorScore"));
		data.setLowerType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.LowerType"));
		data.setLowerTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.LowerTypeScore"));
		data.setGender(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Gender"));
		data.setGenderScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.GenderScore"));
		data.setHair(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Hair"));
		data.setHairScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.HairScore"));
		data.setAge(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Age"));
		data.setAgeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.AgeScore"));
		extractPedestrianFeatureAttrResponse.setData(data);
	 
	 	return extractPedestrianFeatureAttrResponse;
	}
}