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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListSizesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListSizesResponse.SizeModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSizesResponseUnmarshaller {

	public static ListSizesResponse unmarshall(ListSizesResponse listSizesResponse, UnmarshallerContext _ctx) {
		
		listSizesResponse.setRequestId(_ctx.stringValue("ListSizesResponse.RequestId"));
		listSizesResponse.setPageSize(_ctx.integerValue("ListSizesResponse.PageSize"));
		listSizesResponse.setPageNumber(_ctx.integerValue("ListSizesResponse.PageNumber"));
		listSizesResponse.setSuccess(_ctx.booleanValue("ListSizesResponse.Success"));
		listSizesResponse.setTotalCount(_ctx.integerValue("ListSizesResponse.TotalCount"));

		List<SizeModel> sizes = new ArrayList<SizeModel>();
		for (int i = 0; i < _ctx.lengthValue("ListSizesResponse.Sizes.Length"); i++) {
			SizeModel sizeModel = new SizeModel();
			sizeModel.setDescription(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].Description"));
			sizeModel.setName(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].Name"));
			sizeModel.setSizeGroupCode(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].SizeGroupCode"));
			sizeModel.setCreateDate(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].CreateDate"));
			sizeModel.setSizeGroupId(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].SizeGroupId"));
			sizeModel.setCode(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].Code"));
			sizeModel.setSizeGroupName(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].SizeGroupName"));
			sizeModel.setUpdateDate(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].UpdateDate"));
			sizeModel.setDisable(_ctx.integerValue("ListSizesResponse.Sizes["+ i +"].Disable"));
			sizeModel.setSizeId(_ctx.stringValue("ListSizesResponse.Sizes["+ i +"].SizeId"));

			sizes.add(sizeModel);
		}
		listSizesResponse.setSizes(sizes);
	 
	 	return listSizesResponse;
	}
}