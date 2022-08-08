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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeListResourcesResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeListResourcesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeListResourcesResponseUnmarshaller {

	public static DescribeListResourcesResponse unmarshall(DescribeListResourcesResponse describeListResourcesResponse, UnmarshallerContext _ctx) {
		
		describeListResourcesResponse.setRequestId(_ctx.stringValue("DescribeListResourcesResponse.RequestId"));
		describeListResourcesResponse.setErrorCode(_ctx.stringValue("DescribeListResourcesResponse.ErrorCode"));
		describeListResourcesResponse.setCode(_ctx.integerValue("DescribeListResourcesResponse.Code"));
		describeListResourcesResponse.setMsg(_ctx.stringValue("DescribeListResourcesResponse.Msg"));
		describeListResourcesResponse.setSuccess(_ctx.booleanValue("DescribeListResourcesResponse.Success"));

		Data data = new Data();
		data.setTrackId(_ctx.stringValue("DescribeListResourcesResponse.Data.TrackId"));

		List<String> ossLink = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListResourcesResponse.Data.OssLink.Length"); i++) {
			ossLink.add(_ctx.stringValue("DescribeListResourcesResponse.Data.OssLink["+ i +"]"));
		}
		data.setOssLink(ossLink);
		describeListResourcesResponse.setData(data);
	 
	 	return describeListResourcesResponse;
	}
}