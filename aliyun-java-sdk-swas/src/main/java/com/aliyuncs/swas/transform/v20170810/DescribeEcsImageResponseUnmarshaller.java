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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DescribeEcsImageResponse;
import com.aliyuncs.swas.model.v20170810.DescribeEcsImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsImageResponseUnmarshaller {

	public static DescribeEcsImageResponse unmarshall(DescribeEcsImageResponse describeEcsImageResponse, UnmarshallerContext _ctx) {
		
		describeEcsImageResponse.setRequestId(_ctx.stringValue("DescribeEcsImageResponse.RequestId"));
		describeEcsImageResponse.setCode(_ctx.stringValue("DescribeEcsImageResponse.Code"));
		describeEcsImageResponse.setIsSuccess(_ctx.booleanValue("DescribeEcsImageResponse.IsSuccess"));

		Data data = new Data();
		data.setProgress(_ctx.stringValue("DescribeEcsImageResponse.Data.Progress"));
		data.setImageId(_ctx.stringValue("DescribeEcsImageResponse.Data.ImageId"));
		data.setImageName(_ctx.stringValue("DescribeEcsImageResponse.Data.ImageName"));
		data.setImageFamily(_ctx.stringValue("DescribeEcsImageResponse.Data.ImageFamily"));
		data.setImageVersion(_ctx.stringValue("DescribeEcsImageResponse.Data.ImageVersion"));
		data.setDescription(_ctx.stringValue("DescribeEcsImageResponse.Data.Description"));
		data.setSize(_ctx.longValue("DescribeEcsImageResponse.Data.Size"));
		data.setImageOwnerAlias(_ctx.stringValue("DescribeEcsImageResponse.Data.ImageOwnerAlias"));
		data.setIsSupportIoOptimized(_ctx.booleanValue("DescribeEcsImageResponse.Data.IsSupportIoOptimized"));
		data.setIsSupportCloudinit(_ctx.booleanValue("DescribeEcsImageResponse.Data.IsSupportCloudinit"));
		data.setOSName(_ctx.stringValue("DescribeEcsImageResponse.Data.OSName"));
		data.setOSNameEn(_ctx.stringValue("DescribeEcsImageResponse.Data.OSNameEn"));
		data.setArchitecture(_ctx.stringValue("DescribeEcsImageResponse.Data.Architecture"));
		data.setStatus(_ctx.stringValue("DescribeEcsImageResponse.Data.Status"));
		data.setProductCode(_ctx.stringValue("DescribeEcsImageResponse.Data.ProductCode"));
		data.setIsSubscribed(_ctx.booleanValue("DescribeEcsImageResponse.Data.IsSubscribed"));
		data.setCreationTime(_ctx.stringValue("DescribeEcsImageResponse.Data.CreationTime"));
		data.setIsSelfShared(_ctx.stringValue("DescribeEcsImageResponse.Data.IsSelfShared"));
		data.setOSType(_ctx.stringValue("DescribeEcsImageResponse.Data.OSType"));
		data.setPlatform(_ctx.stringValue("DescribeEcsImageResponse.Data.Platform"));
		data.setUsage(_ctx.stringValue("DescribeEcsImageResponse.Data.Usage"));
		data.setIsCopied(_ctx.booleanValue("DescribeEcsImageResponse.Data.IsCopied"));
		data.setResourceGroupId(_ctx.stringValue("DescribeEcsImageResponse.Data.ResourceGroupId"));
		describeEcsImageResponse.setData(data);
	 
	 	return describeEcsImageResponse;
	}
}