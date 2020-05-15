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

package com.aliyuncs.goodstech.transform.v20191230;

import com.aliyuncs.goodstech.model.v20191230.RecognizeFurnitureAttributeResponse;
import com.aliyuncs.goodstech.model.v20191230.RecognizeFurnitureAttributeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFurnitureAttributeResponseUnmarshaller {

	public static RecognizeFurnitureAttributeResponse unmarshall(RecognizeFurnitureAttributeResponse recognizeFurnitureAttributeResponse, UnmarshallerContext _ctx) {
		
		recognizeFurnitureAttributeResponse.setRequestId(_ctx.stringValue("RecognizeFurnitureAttributeResponse.RequestId"));

		Data data = new Data();
		data.setPredStyleId(_ctx.stringValue("RecognizeFurnitureAttributeResponse.Data.PredStyleId"));
		data.setPredStyle(_ctx.stringValue("RecognizeFurnitureAttributeResponse.Data.PredStyle"));
		data.setPredProbability(_ctx.floatValue("RecognizeFurnitureAttributeResponse.Data.PredProbability"));
		recognizeFurnitureAttributeResponse.setData(data);
	 
	 	return recognizeFurnitureAttributeResponse;
	}
}