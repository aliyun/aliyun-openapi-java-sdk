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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeHouyiImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeHouyiImageResponseUnmarshaller {

	public static OpsDescribeHouyiImageResponse unmarshall(OpsDescribeHouyiImageResponse opsDescribeHouyiImageResponse, UnmarshallerContext _ctx) {
		
		opsDescribeHouyiImageResponse.setRequestId(_ctx.stringValue("OpsDescribeHouyiImageResponse.RequestId"));
		opsDescribeHouyiImageResponse.setSnapshotId(_ctx.stringValue("OpsDescribeHouyiImageResponse.SnapshotId"));
		opsDescribeHouyiImageResponse.setDescription(_ctx.stringValue("OpsDescribeHouyiImageResponse.Description"));
		opsDescribeHouyiImageResponse.setFormat(_ctx.stringValue("OpsDescribeHouyiImageResponse.Format"));
		opsDescribeHouyiImageResponse.setPlatform(_ctx.stringValue("OpsDescribeHouyiImageResponse.Platform"));
		opsDescribeHouyiImageResponse.setImageSize(_ctx.integerValue("OpsDescribeHouyiImageResponse.ImageSize"));
		opsDescribeHouyiImageResponse.setImageId(_ctx.stringValue("OpsDescribeHouyiImageResponse.ImageId"));
		opsDescribeHouyiImageResponse.setName(_ctx.stringValue("OpsDescribeHouyiImageResponse.Name"));
	 
	 	return opsDescribeHouyiImageResponse;
	}
}