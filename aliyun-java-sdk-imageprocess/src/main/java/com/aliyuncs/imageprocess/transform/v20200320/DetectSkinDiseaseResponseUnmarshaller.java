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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.DetectSkinDiseaseResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectSkinDiseaseResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectSkinDiseaseResponseUnmarshaller {

	public static DetectSkinDiseaseResponse unmarshall(DetectSkinDiseaseResponse detectSkinDiseaseResponse, UnmarshallerContext _ctx) {
		
		detectSkinDiseaseResponse.setRequestId(_ctx.stringValue("DetectSkinDiseaseResponse.RequestId"));

		Data data = new Data();
		data.setResults(_ctx.mapValue("DetectSkinDiseaseResponse.Data.Results"));
		detectSkinDiseaseResponse.setData(data);
	 
	 	return detectSkinDiseaseResponse;
	}
}