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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.AttachDatasetResponse;
import com.aliyuncs.airec.model.v20181012.AttachDatasetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachDatasetResponseUnmarshaller {

	public static AttachDatasetResponse unmarshall(AttachDatasetResponse attachDatasetResponse, UnmarshallerContext _ctx) {
		
		attachDatasetResponse.setRequestId(_ctx.stringValue("AttachDatasetResponse.RequestId"));
		attachDatasetResponse.setCode(_ctx.stringValue("AttachDatasetResponse.Code"));
		attachDatasetResponse.setMessage(_ctx.stringValue("AttachDatasetResponse.Message"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("AttachDatasetResponse.Result.InstanceId"));
		result.setVersionId(_ctx.stringValue("AttachDatasetResponse.Result.VersionId"));
		result.setState(_ctx.stringValue("AttachDatasetResponse.Result.State"));
		result.setGmtCreate(_ctx.longValue("AttachDatasetResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("AttachDatasetResponse.Result.GmtModified"));
		attachDatasetResponse.setResult(result);
	 
	 	return attachDatasetResponse;
	}
}