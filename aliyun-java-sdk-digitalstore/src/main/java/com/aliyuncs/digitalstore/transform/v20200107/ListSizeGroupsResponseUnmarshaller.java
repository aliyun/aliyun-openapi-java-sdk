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

import com.aliyuncs.digitalstore.model.v20200107.ListSizeGroupsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListSizeGroupsResponse.SizeGroupModel;
import com.aliyuncs.digitalstore.model.v20200107.ListSizeGroupsResponse.SizeGroupModel.SizeModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSizeGroupsResponseUnmarshaller {

	public static ListSizeGroupsResponse unmarshall(ListSizeGroupsResponse listSizeGroupsResponse, UnmarshallerContext _ctx) {
		
		listSizeGroupsResponse.setRequestId(_ctx.stringValue("ListSizeGroupsResponse.RequestId"));
		listSizeGroupsResponse.setPageSize(_ctx.integerValue("ListSizeGroupsResponse.PageSize"));
		listSizeGroupsResponse.setPageNumber(_ctx.integerValue("ListSizeGroupsResponse.PageNumber"));
		listSizeGroupsResponse.setSuccess(_ctx.booleanValue("ListSizeGroupsResponse.Success"));
		listSizeGroupsResponse.setTotalCount(_ctx.integerValue("ListSizeGroupsResponse.TotalCount"));

		List<SizeGroupModel> sizeGroups = new ArrayList<SizeGroupModel>();
		for (int i = 0; i < _ctx.lengthValue("ListSizeGroupsResponse.SizeGroups.Length"); i++) {
			SizeGroupModel sizeGroupModel = new SizeGroupModel();
			sizeGroupModel.setCreateDate(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].CreateDate"));
			sizeGroupModel.setDescription(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Description"));
			sizeGroupModel.setName(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Name"));
			sizeGroupModel.setDisable(_ctx.integerValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Disable"));
			sizeGroupModel.setCode(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Code"));
			sizeGroupModel.setUpdateDate(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].UpdateDate"));
			sizeGroupModel.setSizeGroupId(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].SizeGroupId"));

			List<SizeModel> sizes = new ArrayList<SizeModel>();
			for (int j = 0; j < _ctx.lengthValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes.Length"); j++) {
				SizeModel sizeModel = new SizeModel();
				sizeModel.setDescription(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].Description"));
				sizeModel.setSizeName(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeName"));
				sizeModel.setSizeGroupCode(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeGroupCode"));
				sizeModel.setCreateDate(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].CreateDate"));
				sizeModel.setSizeGroupId(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeGroupId"));
				sizeModel.setSizeCode(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeCode"));
				sizeModel.setSizeGroupName(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeGroupName"));
				sizeModel.setUpdateDate(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].UpdateDate"));
				sizeModel.setDisable(_ctx.integerValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].Disable"));
				sizeModel.setSizeId(_ctx.stringValue("ListSizeGroupsResponse.SizeGroups["+ i +"].Sizes["+ j +"].SizeId"));

				sizes.add(sizeModel);
			}
			sizeGroupModel.setSizes(sizes);

			sizeGroups.add(sizeGroupModel);
		}
		listSizeGroupsResponse.setSizeGroups(sizeGroups);
	 
	 	return listSizeGroupsResponse;
	}
}