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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.QueryBarrelImageListResponse;
import com.aliyuncs.premiumpics.model.v20200505.QueryBarrelImageListResponse.Image;
import com.aliyuncs.premiumpics.model.v20200505.QueryBarrelImageListResponse.Image.Specification;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBarrelImageListResponseUnmarshaller {

	public static QueryBarrelImageListResponse unmarshall(QueryBarrelImageListResponse queryBarrelImageListResponse, UnmarshallerContext _ctx) {
		
		queryBarrelImageListResponse.setRequestId(_ctx.stringValue("QueryBarrelImageListResponse.RequestId"));
		queryBarrelImageListResponse.setPageSize(_ctx.integerValue("QueryBarrelImageListResponse.PageSize"));
		queryBarrelImageListResponse.setErrorMsg(_ctx.stringValue("QueryBarrelImageListResponse.ErrorMsg"));
		queryBarrelImageListResponse.setErrorCode(_ctx.stringValue("QueryBarrelImageListResponse.ErrorCode"));
		queryBarrelImageListResponse.setHasNext(_ctx.booleanValue("QueryBarrelImageListResponse.HasNext"));
		queryBarrelImageListResponse.setSuccess(_ctx.booleanValue("QueryBarrelImageListResponse.Success"));
		queryBarrelImageListResponse.setNextId(_ctx.integerValue("QueryBarrelImageListResponse.NextId"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("QueryBarrelImageListResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setBuy(_ctx.booleanValue("QueryBarrelImageListResponse.Images["+ i +"].Buy"));
			image.setMidImage(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].MidImage"));
			image.setBigImage(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].BigImage"));
			image.setSmallImage(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].SmallImage"));
			image.setTitle(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Title"));
			image.setTag(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Tag"));
			image.setImageId(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].ImageId"));

			List<Specification> specifications = new ArrayList<Specification>();
			for (int j = 0; j < _ctx.lengthValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications.Length"); j++) {
				Specification specification = new Specification();
				specification.setPrice(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Price"));
				specification.setWidth(_ctx.integerValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Width"));
				specification.setHeight(_ctx.integerValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Height"));
				specification.setName(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Name"));
				specification.setImageId(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].ImageId"));
				specification.setId(_ctx.longValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Id"));
				specification.setSuffix(_ctx.stringValue("QueryBarrelImageListResponse.Images["+ i +"].Specifications["+ j +"].Suffix"));

				specifications.add(specification);
			}
			image.setSpecifications(specifications);

			images.add(image);
		}
		queryBarrelImageListResponse.setImages(images);
	 
	 	return queryBarrelImageListResponse;
	}
}