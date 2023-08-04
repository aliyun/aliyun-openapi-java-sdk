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

import com.aliyuncs.mns.model.v20210319.DoesBucketExistResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoesBucketExistResponseUnmarshaller {

	public static DoesBucketExistResponse unmarshall(DoesBucketExistResponse doesBucketExistResponse, UnmarshallerContext _ctx) {
		
		doesBucketExistResponse.setRequestId(_ctx.stringValue("DoesBucketExistResponse.RequestId"));
		doesBucketExistResponse.setCode(_ctx.longValue("DoesBucketExistResponse.Code"));
		doesBucketExistResponse.setStatus(_ctx.stringValue("DoesBucketExistResponse.Status"));
		doesBucketExistResponse.setMessage(_ctx.stringValue("DoesBucketExistResponse.Message"));
		doesBucketExistResponse.setSuccess(_ctx.booleanValue("DoesBucketExistResponse.Success"));
		doesBucketExistResponse.setData(_ctx.booleanValue("DoesBucketExistResponse.Data"));
	 
	 	return doesBucketExistResponse;
	}
}