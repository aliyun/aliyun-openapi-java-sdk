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

import com.aliyuncs.goodstech.model.v20191230.RecognizeFurnitureSpuResponse;
import com.aliyuncs.goodstech.model.v20191230.RecognizeFurnitureSpuResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFurnitureSpuResponseUnmarshaller {

	public static RecognizeFurnitureSpuResponse unmarshall(RecognizeFurnitureSpuResponse recognizeFurnitureSpuResponse, UnmarshallerContext _ctx) {
		
		recognizeFurnitureSpuResponse.setRequestId(_ctx.stringValue("RecognizeFurnitureSpuResponse.RequestId"));

		Data data = new Data();
		data.setPredCateId(_ctx.stringValue("RecognizeFurnitureSpuResponse.Data.PredCateId"));
		data.setPredCate(_ctx.stringValue("RecognizeFurnitureSpuResponse.Data.PredCate"));
		data.setPredProbability(_ctx.floatValue("RecognizeFurnitureSpuResponse.Data.PredProbability"));
		recognizeFurnitureSpuResponse.setData(data);
	 
	 	return recognizeFurnitureSpuResponse;
	}
}