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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.SyncMerchantInfoResponse;
import com.aliyuncs.linkedmall.model.v20180116.SyncMerchantInfoResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncMerchantInfoResponseUnmarshaller {

	public static SyncMerchantInfoResponse unmarshall(SyncMerchantInfoResponse syncMerchantInfoResponse, UnmarshallerContext _ctx) {
		
		syncMerchantInfoResponse.setRequestId(_ctx.stringValue("SyncMerchantInfoResponse.RequestId"));
		syncMerchantInfoResponse.setCode(_ctx.stringValue("SyncMerchantInfoResponse.Code"));
		syncMerchantInfoResponse.setMessage(_ctx.stringValue("SyncMerchantInfoResponse.Message"));

		Model model = new Model();
		model.setUrl(_ctx.stringValue("SyncMerchantInfoResponse.Model.Url"));
		model.setTaskId(_ctx.stringValue("SyncMerchantInfoResponse.Model.TaskId"));
		model.setStatus(_ctx.stringValue("SyncMerchantInfoResponse.Model.Status"));
		syncMerchantInfoResponse.setModel(model);
	 
	 	return syncMerchantInfoResponse;
	}
}