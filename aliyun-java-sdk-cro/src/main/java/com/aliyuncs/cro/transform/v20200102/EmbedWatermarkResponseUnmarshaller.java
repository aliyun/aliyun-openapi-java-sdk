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

import com.aliyuncs.cro.model.v20200102.EmbedWatermarkResponse;
import com.aliyuncs.cro.model.v20200102.EmbedWatermarkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EmbedWatermarkResponseUnmarshaller {

	public static EmbedWatermarkResponse unmarshall(EmbedWatermarkResponse embedWatermarkResponse, UnmarshallerContext _ctx) {
		
		embedWatermarkResponse.setMsg(_ctx.stringValue("EmbedWatermarkResponse.Msg"));
		embedWatermarkResponse.setCode(_ctx.stringValue("EmbedWatermarkResponse.Code"));
		embedWatermarkResponse.setSuccess(_ctx.booleanValue("EmbedWatermarkResponse.Success"));

		Data data = new Data();
		data.setCarrierLink(_ctx.stringValue("EmbedWatermarkResponse.Data.CarrierLink"));
		data.setOutFileSize(_ctx.longValue("EmbedWatermarkResponse.Data.OutFileSize"));
		embedWatermarkResponse.setData(data);
	 
	 	return embedWatermarkResponse;
	}
}