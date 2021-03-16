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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiskMigrateProgressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiskMigrateProgressResponseUnmarshaller {

	public static OpsQueryDiskMigrateProgressResponse unmarshall(OpsQueryDiskMigrateProgressResponse opsQueryDiskMigrateProgressResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiskMigrateProgressResponse.setCode(_ctx.stringValue("OpsQueryDiskMigrateProgressResponse.Code"));
		opsQueryDiskMigrateProgressResponse.setMessage(_ctx.stringValue("OpsQueryDiskMigrateProgressResponse.Message"));
		opsQueryDiskMigrateProgressResponse.setSuccess(_ctx.stringValue("OpsQueryDiskMigrateProgressResponse.Success"));
		opsQueryDiskMigrateProgressResponse.setLoadProgress(_ctx.longValue("OpsQueryDiskMigrateProgressResponse.LoadProgress"));
	 
	 	return opsQueryDiskMigrateProgressResponse;
	}
}