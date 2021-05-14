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

import com.aliyuncs.facebody.model.v20191230.GenerateHumanSketchStyleResponse;
import com.aliyuncs.facebody.model.v20191230.GenerateHumanSketchStyleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateHumanSketchStyleResponseUnmarshaller {

	public static GenerateHumanSketchStyleResponse unmarshall(GenerateHumanSketchStyleResponse generateHumanSketchStyleResponse, UnmarshallerContext _ctx) {
		
		generateHumanSketchStyleResponse.setRequestId(_ctx.stringValue("GenerateHumanSketchStyleResponse.RequestId"));
		generateHumanSketchStyleResponse.setCode(_ctx.stringValue("GenerateHumanSketchStyleResponse.Code"));
		generateHumanSketchStyleResponse.setMessage(_ctx.stringValue("GenerateHumanSketchStyleResponse.Message"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("GenerateHumanSketchStyleResponse.Data.ImageURL"));
		generateHumanSketchStyleResponse.setData(data);
	 
	 	return generateHumanSketchStyleResponse;
	}
}