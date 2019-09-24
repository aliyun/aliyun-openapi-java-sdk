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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeDRAppliancesResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeDRAppliancesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDRAppliancesResponseUnmarshaller {

	public static DescribeDRAppliancesResponse unmarshall(DescribeDRAppliancesResponse describeDRAppliancesResponse, UnmarshallerContext _ctx) {
		
		describeDRAppliancesResponse.setRequestId(_ctx.stringValue("DescribeDRAppliancesResponse.RequestId"));
		describeDRAppliancesResponse.setSuccess(_ctx.booleanValue("DescribeDRAppliancesResponse.Success"));
		describeDRAppliancesResponse.setCode(_ctx.stringValue("DescribeDRAppliancesResponse.Code"));
		describeDRAppliancesResponse.setMessage(_ctx.stringValue("DescribeDRAppliancesResponse.Message"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDRAppliancesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setName(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Name"));
			image.setTitle(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Title"));
			image.setVersion(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Version"));
			image.setModifiedDate(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].ModifiedDate"));
			image.setType(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Type"));
			image.setMd5(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Md5"));
			image.setDescription(_ctx.stringValue("DescribeDRAppliancesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.longValue("DescribeDRAppliancesResponse.Images["+ i +"].Size"));

			images.add(image);
		}
		describeDRAppliancesResponse.setImages(images);
	 
	 	return describeDRAppliancesResponse;
	}
}