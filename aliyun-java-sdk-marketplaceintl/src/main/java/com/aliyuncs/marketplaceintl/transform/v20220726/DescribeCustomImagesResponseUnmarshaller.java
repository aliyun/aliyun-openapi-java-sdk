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

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeCustomImagesResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeCustomImagesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomImagesResponseUnmarshaller {

	public static DescribeCustomImagesResponse unmarshall(DescribeCustomImagesResponse describeCustomImagesResponse, UnmarshallerContext _ctx) {
		
		describeCustomImagesResponse.setRequestId(_ctx.stringValue("DescribeCustomImagesResponse.RequestId"));
		describeCustomImagesResponse.setErrorCode(_ctx.stringValue("DescribeCustomImagesResponse.ErrorCode"));
		describeCustomImagesResponse.setCode(_ctx.integerValue("DescribeCustomImagesResponse.Code"));
		describeCustomImagesResponse.setMsg(_ctx.stringValue("DescribeCustomImagesResponse.Msg"));
		describeCustomImagesResponse.setSuccess(_ctx.booleanValue("DescribeCustomImagesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomImagesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedOn(_ctx.longValue("DescribeCustomImagesResponse.Data["+ i +"].CreatedOn"));
			dataItem.setImageId(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].ImageId"));
			dataItem.setImageName(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].ImageName"));
			dataItem.setImageSize(_ctx.integerValue("DescribeCustomImagesResponse.Data["+ i +"].ImageSize"));
			dataItem.setOsname(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].Osname"));
			dataItem.setPlatform(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].Platform"));
			dataItem.setPlatformBit(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].PlatformBit"));
			dataItem.setPlatformType(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].PlatformType"));
			dataItem.setRegion(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].Region"));
			dataItem.setTrackId(_ctx.stringValue("DescribeCustomImagesResponse.Data["+ i +"].TrackId"));

			data.add(dataItem);
		}
		describeCustomImagesResponse.setData(data);
	 
	 	return describeCustomImagesResponse;
	}
}