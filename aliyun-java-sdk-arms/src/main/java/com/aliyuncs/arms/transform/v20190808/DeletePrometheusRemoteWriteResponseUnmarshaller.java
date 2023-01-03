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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.DeletePrometheusRemoteWriteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePrometheusRemoteWriteResponseUnmarshaller {

	public static DeletePrometheusRemoteWriteResponse unmarshall(DeletePrometheusRemoteWriteResponse deletePrometheusRemoteWriteResponse, UnmarshallerContext _ctx) {
		
		deletePrometheusRemoteWriteResponse.setRequestId(_ctx.stringValue("DeletePrometheusRemoteWriteResponse.RequestId"));
		deletePrometheusRemoteWriteResponse.setData(_ctx.stringValue("DeletePrometheusRemoteWriteResponse.Data"));
		deletePrometheusRemoteWriteResponse.setSuccess(_ctx.booleanValue("DeletePrometheusRemoteWriteResponse.Success"));
		deletePrometheusRemoteWriteResponse.setMessage(_ctx.stringValue("DeletePrometheusRemoteWriteResponse.Message"));
		deletePrometheusRemoteWriteResponse.setCode(_ctx.integerValue("DeletePrometheusRemoteWriteResponse.Code"));
	 
	 	return deletePrometheusRemoteWriteResponse;
	}
}