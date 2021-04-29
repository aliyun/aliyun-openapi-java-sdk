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
		extractPedestrianFeatureAttrResponse.setMessage(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Message"));
		extractPedestrianFeatureAttrResponse.setCode(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Code"));

		Data data = new Data();
		data.setHair(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Hair"));
		data.setUpperType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.UpperType"));
		data.setUpperTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.UpperTypeScore"));
		data.setLowerColor(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.LowerColor"));
		data.setQualityScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.QualityScore"));
		data.setGender(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Gender"));
		data.setOrientation(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Orientation"));
		data.setFeature(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Feature"));
		data.setOrientationScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.OrientationScore"));
		data.setUpperColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.UpperColorScore"));
		data.setGenderScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.GenderScore"));
		data.setLowerColorScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.LowerColorScore"));
		data.setObjType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.ObjType"));
		data.setLowerTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.LowerTypeScore"));
		data.setHairScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.HairScore"));
		data.setUpperColor(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.UpperColor"));
		data.setLowerType(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.LowerType"));
		data.setAgeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.AgeScore"));
		data.setObjTypeScore(_ctx.floatValue("ExtractPedestrianFeatureAttrResponse.Data.ObjTypeScore"));
		data.setAge(_ctx.stringValue("ExtractPedestrianFeatureAttrResponse.Data.Age"));
		extractPedestrianFeatureAttrResponse.setData(data);
	 
	 	return extractPedestrianFeatureAttrResponse;
	}
}