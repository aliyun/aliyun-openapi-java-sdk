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

	public static AttachDatasetResponse unmarshall(AttachDatasetResponse attachDatasetResponse, UnmarshallerContext context) {
		
		attachDatasetResponse.setRequestId(context.stringValue("AttachDatasetResponse.RequestId"));
		attachDatasetResponse.setCode(context.stringValue("AttachDatasetResponse.Code"));
		attachDatasetResponse.setMessage(context.stringValue("AttachDatasetResponse.Message"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("AttachDatasetResponse.Result.InstanceId"));
		result.setVersionId(context.stringValue("AttachDatasetResponse.Result.VersionId"));
		result.setState(context.stringValue("AttachDatasetResponse.Result.State"));
		result.setGmtCreate(context.longValue("AttachDatasetResponse.Result.GmtCreate"));
		result.setGmtModified(context.longValue("AttachDatasetResponse.Result.GmtModified"));
		attachDatasetResponse.setResult(result);
	 
	 	return attachDatasetResponse;
	}
}