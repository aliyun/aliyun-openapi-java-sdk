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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.AttachDatasetResponse;
import com.aliyuncs.airec.model.v20201126.AttachDatasetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachDatasetResponseUnmarshaller {

	public static AttachDatasetResponse unmarshall(AttachDatasetResponse attachDatasetResponse, UnmarshallerContext _ctx) {
		
		attachDatasetResponse.setCode(_ctx.stringValue("AttachDatasetResponse.code"));
		attachDatasetResponse.setMessage(_ctx.stringValue("AttachDatasetResponse.message"));
		attachDatasetResponse.setRequestId(_ctx.stringValue("AttachDatasetResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.longValue("AttachDatasetResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.longValue("AttachDatasetResponse.result.gmtModified"));
		result.setInstanceId(_ctx.stringValue("AttachDatasetResponse.result.instanceId"));
		result.setState(_ctx.stringValue("AttachDatasetResponse.result.state"));
		result.setVersionId(_ctx.stringValue("AttachDatasetResponse.result.versionId"));
		attachDatasetResponse.setResult(result);
	 
	 	return attachDatasetResponse;
	}
}