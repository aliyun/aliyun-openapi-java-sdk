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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BatchCreateSoundCodeLabelWithLabelsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateSoundCodeLabelWithLabelsResponseUnmarshaller {

	public static BatchCreateSoundCodeLabelWithLabelsResponse unmarshall(BatchCreateSoundCodeLabelWithLabelsResponse batchCreateSoundCodeLabelWithLabelsResponse, UnmarshallerContext _ctx) {
		
		batchCreateSoundCodeLabelWithLabelsResponse.setRequestId(_ctx.stringValue("BatchCreateSoundCodeLabelWithLabelsResponse.RequestId"));
		batchCreateSoundCodeLabelWithLabelsResponse.setSuccess(_ctx.booleanValue("BatchCreateSoundCodeLabelWithLabelsResponse.Success"));
		batchCreateSoundCodeLabelWithLabelsResponse.setCode(_ctx.stringValue("BatchCreateSoundCodeLabelWithLabelsResponse.Code"));
		batchCreateSoundCodeLabelWithLabelsResponse.setErrorMessage(_ctx.stringValue("BatchCreateSoundCodeLabelWithLabelsResponse.ErrorMessage"));
		batchCreateSoundCodeLabelWithLabelsResponse.setData(_ctx.stringValue("BatchCreateSoundCodeLabelWithLabelsResponse.Data"));
	 
	 	return batchCreateSoundCodeLabelWithLabelsResponse;
	}
}