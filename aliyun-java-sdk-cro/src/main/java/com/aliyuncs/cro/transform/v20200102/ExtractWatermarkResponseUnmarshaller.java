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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.ExtractWatermarkResponse;
import com.aliyuncs.cro.model.v20200102.ExtractWatermarkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExtractWatermarkResponseUnmarshaller {

	public static ExtractWatermarkResponse unmarshall(ExtractWatermarkResponse extractWatermarkResponse, UnmarshallerContext _ctx) {
		
		extractWatermarkResponse.setRequestId(_ctx.stringValue("ExtractWatermarkResponse.RequestId"));
		extractWatermarkResponse.setMsg(_ctx.stringValue("ExtractWatermarkResponse.Msg"));
		extractWatermarkResponse.setCode(_ctx.stringValue("ExtractWatermarkResponse.Code"));
		extractWatermarkResponse.setSuccess(_ctx.booleanValue("ExtractWatermarkResponse.Success"));

		Data data = new Data();
		data.setInvisibleText(_ctx.stringValue("ExtractWatermarkResponse.Data.InvisibleText"));
		extractWatermarkResponse.setData(data);
	 
	 	return extractWatermarkResponse;
	}
}