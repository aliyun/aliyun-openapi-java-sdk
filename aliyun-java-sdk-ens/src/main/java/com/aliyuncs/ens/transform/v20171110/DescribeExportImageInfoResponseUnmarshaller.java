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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeExportImageInfoResponse;
import com.aliyuncs.ens.model.v20171110.DescribeExportImageInfoResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExportImageInfoResponseUnmarshaller {

	public static DescribeExportImageInfoResponse unmarshall(DescribeExportImageInfoResponse describeExportImageInfoResponse, UnmarshallerContext _ctx) {
		
		describeExportImageInfoResponse.setRequestId(_ctx.stringValue("DescribeExportImageInfoResponse.RequestId"));
		describeExportImageInfoResponse.setTotalCount(_ctx.integerValue("DescribeExportImageInfoResponse.TotalCount"));
		describeExportImageInfoResponse.setPageSize(_ctx.integerValue("DescribeExportImageInfoResponse.PageSize"));
		describeExportImageInfoResponse.setPageNumber(_ctx.integerValue("DescribeExportImageInfoResponse.PageNumber"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExportImageInfoResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageOwnerAlias(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setImageName(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].ImageName"));
			image.setPlatform(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].Platform"));
			image.setArchitecture(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].Architecture"));
			image.setExportedImageURL(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].ExportedImageURL"));
			image.setImageId(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].ImageId"));
			image.setCreationTime(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].CreationTime"));
			image.setImageExportStatus(_ctx.stringValue("DescribeExportImageInfoResponse.Images["+ i +"].ImageExportStatus"));

			images.add(image);
		}
		describeExportImageInfoResponse.setImages(images);
	 
	 	return describeExportImageInfoResponse;
	}
}