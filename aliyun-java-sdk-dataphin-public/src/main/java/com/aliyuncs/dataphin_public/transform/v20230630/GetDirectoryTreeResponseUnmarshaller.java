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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDirectoryTreeResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDirectoryTreeResponse.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetDirectoryTreeResponse.DataItem.Children;
import com.aliyuncs.dataphin_public.model.v20230630.GetDirectoryTreeResponse.DataItem.Parent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDirectoryTreeResponseUnmarshaller {

	public static GetDirectoryTreeResponse unmarshall(GetDirectoryTreeResponse getDirectoryTreeResponse, UnmarshallerContext _ctx) {
		
		getDirectoryTreeResponse.setRequestId(_ctx.stringValue("GetDirectoryTreeResponse.RequestId"));
		getDirectoryTreeResponse.setSuccess(_ctx.booleanValue("GetDirectoryTreeResponse.Success"));
		getDirectoryTreeResponse.setHttpStatusCode(_ctx.integerValue("GetDirectoryTreeResponse.HttpStatusCode"));
		getDirectoryTreeResponse.setCode(_ctx.stringValue("GetDirectoryTreeResponse.Code"));
		getDirectoryTreeResponse.setMessage(_ctx.stringValue("GetDirectoryTreeResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDirectoryTreeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();

			Parent parent = new Parent();
			parent.setId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.Id"));
			parent.setStringId(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.StringId"));
			parent.setProjectId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.ProjectId"));
			parent.setCategoryType(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.CategoryType"));
			parent.setDataCellId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.DataCellId"));
			parent.setDirName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.DirName"));
			parent.setName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.Name"));
			parent.setType(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.Type"));
			parent.setCreator(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.Creator"));
			parent.setCreatorName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.CreatorName"));
			parent.setGmtCreate(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.GmtCreate"));
			parent.setGmtModified(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.GmtModified"));
			parent.setLastModifier(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.LastModifier"));
			parent.setLastModifierName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Parent.LastModifierName"));
			dataItem.setParent(parent);

			Children children = new Children();
			children.setId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Children.Id"));
			children.setStringId(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.StringId"));
			children.setProjectId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Children.ProjectId"));
			children.setCategoryType(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.CategoryType"));
			children.setDataCellId(_ctx.longValue("GetDirectoryTreeResponse.Data["+ i +"].Children.DataCellId"));
			children.setDirName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.DirName"));
			children.setName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.Name"));
			children.setType(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.Type"));
			children.setCreator(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.Creator"));
			children.setCreatorName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.CreatorName"));
			children.setGmtCreate(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.GmtCreate"));
			children.setGmtModified(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.GmtModified"));
			children.setLastModifier(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.LastModifier"));
			children.setLastModifierName(_ctx.stringValue("GetDirectoryTreeResponse.Data["+ i +"].Children.LastModifierName"));
			dataItem.setChildren(children);

			data.add(dataItem);
		}
		getDirectoryTreeResponse.setData(data);
	 
	 	return getDirectoryTreeResponse;
	}
}