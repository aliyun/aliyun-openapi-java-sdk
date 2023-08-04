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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetBucketAclResponse;
import com.aliyuncs.mns.model.v20210319.GetBucketAclResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketAclResponseUnmarshaller {

	public static GetBucketAclResponse unmarshall(GetBucketAclResponse getBucketAclResponse, UnmarshallerContext _ctx) {
		
		getBucketAclResponse.setRequestId(_ctx.stringValue("GetBucketAclResponse.RequestId"));
		getBucketAclResponse.setCode(_ctx.longValue("GetBucketAclResponse.Code"));
		getBucketAclResponse.setStatus(_ctx.stringValue("GetBucketAclResponse.Status"));
		getBucketAclResponse.setMessage(_ctx.stringValue("GetBucketAclResponse.Message"));
		getBucketAclResponse.setSuccess(_ctx.booleanValue("GetBucketAclResponse.Success"));

		Data data = new Data();
		data.setBucketId(_ctx.stringValue("GetBucketAclResponse.Data.BucketId"));
		data.setBucketName(_ctx.stringValue("GetBucketAclResponse.Data.BucketName"));
		data.setBucketAcl(_ctx.stringValue("GetBucketAclResponse.Data.BucketAcl"));
		getBucketAclResponse.setData(data);
	 
	 	return getBucketAclResponse;
	}
}