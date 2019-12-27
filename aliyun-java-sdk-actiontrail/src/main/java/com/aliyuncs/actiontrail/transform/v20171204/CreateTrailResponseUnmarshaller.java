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

package com.aliyuncs.actiontrail.transform.v20171204;

import com.aliyuncs.actiontrail.model.v20171204.CreateTrailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrailResponseUnmarshaller {

	public static CreateTrailResponse unmarshall(CreateTrailResponse createTrailResponse, UnmarshallerContext _ctx) {
		
		createTrailResponse.setRequestId(_ctx.stringValue("CreateTrailResponse.RequestId"));
		createTrailResponse.setName(_ctx.stringValue("CreateTrailResponse.Name"));
		createTrailResponse.setHomeRegion(_ctx.stringValue("CreateTrailResponse.HomeRegion"));
		createTrailResponse.setOssBucketName(_ctx.stringValue("CreateTrailResponse.OssBucketName"));
		createTrailResponse.setOssKeyPrefix(_ctx.stringValue("CreateTrailResponse.OssKeyPrefix"));
		createTrailResponse.setRoleName(_ctx.stringValue("CreateTrailResponse.RoleName"));
		createTrailResponse.setSlsProjectArn(_ctx.stringValue("CreateTrailResponse.SlsProjectArn"));
		createTrailResponse.setSlsWriteRoleArn(_ctx.stringValue("CreateTrailResponse.SlsWriteRoleArn"));
		createTrailResponse.setEventRW(_ctx.stringValue("CreateTrailResponse.EventRW"));
		createTrailResponse.setTrailRegion(_ctx.stringValue("CreateTrailResponse.TrailRegion"));
	 
	 	return createTrailResponse;
	}
}