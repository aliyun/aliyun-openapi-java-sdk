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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.SubmitAudioLabelResponse;
import com.aliyuncs.qualitycheck.model.v20190115.SubmitAudioLabelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAudioLabelResponseUnmarshaller {

	public static SubmitAudioLabelResponse unmarshall(SubmitAudioLabelResponse submitAudioLabelResponse, UnmarshallerContext _ctx) {
		
		submitAudioLabelResponse.setRequestId(_ctx.stringValue("SubmitAudioLabelResponse.RequestId"));
		submitAudioLabelResponse.setSuccess(_ctx.booleanValue("SubmitAudioLabelResponse.Success"));
		submitAudioLabelResponse.setCode(_ctx.stringValue("SubmitAudioLabelResponse.Code"));
		submitAudioLabelResponse.setMessage(_ctx.stringValue("SubmitAudioLabelResponse.Message"));

		Data data = new Data();
		data.setAsrAccuracyRate(_ctx.stringValue("SubmitAudioLabelResponse.Data.AsrAccuracyRate"));
		data.setLabelNum(_ctx.integerValue("SubmitAudioLabelResponse.Data.LabelNum"));
		data.setPoc(_ctx.booleanValue("SubmitAudioLabelResponse.Data.Poc"));
		submitAudioLabelResponse.setData(data);
	 
	 	return submitAudioLabelResponse;
	}
}