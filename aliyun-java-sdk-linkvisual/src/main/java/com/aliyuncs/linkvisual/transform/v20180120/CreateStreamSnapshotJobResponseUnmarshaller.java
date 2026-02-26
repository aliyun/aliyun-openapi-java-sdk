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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateStreamSnapshotJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStreamSnapshotJobResponseUnmarshaller {

	public static CreateStreamSnapshotJobResponse unmarshall(CreateStreamSnapshotJobResponse createStreamSnapshotJobResponse, UnmarshallerContext _ctx) {
		
		createStreamSnapshotJobResponse.setRequestId(_ctx.stringValue("CreateStreamSnapshotJobResponse.RequestId"));
		createStreamSnapshotJobResponse.setCode(_ctx.stringValue("CreateStreamSnapshotJobResponse.Code"));
		createStreamSnapshotJobResponse.setErrorMessage(_ctx.stringValue("CreateStreamSnapshotJobResponse.ErrorMessage"));
		createStreamSnapshotJobResponse.setSuccess(_ctx.booleanValue("CreateStreamSnapshotJobResponse.Success"));
	 
	 	return createStreamSnapshotJobResponse;
	}
}