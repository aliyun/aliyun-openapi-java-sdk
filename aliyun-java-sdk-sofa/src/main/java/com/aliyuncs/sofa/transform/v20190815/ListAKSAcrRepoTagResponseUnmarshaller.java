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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoTagResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoTagResponse.TagList;
import com.aliyuncs.sofa.model.v20190815.ListAKSAcrRepoTagResponse.TagList.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSAcrRepoTagResponseUnmarshaller {

	public static ListAKSAcrRepoTagResponse unmarshall(ListAKSAcrRepoTagResponse listAKSAcrRepoTagResponse, UnmarshallerContext _ctx) {
		
		listAKSAcrRepoTagResponse.setRequestId(_ctx.stringValue("ListAKSAcrRepoTagResponse.RequestId"));
		listAKSAcrRepoTagResponse.setResultCode(_ctx.stringValue("ListAKSAcrRepoTagResponse.ResultCode"));
		listAKSAcrRepoTagResponse.setResultMessage(_ctx.stringValue("ListAKSAcrRepoTagResponse.ResultMessage"));

		TagList tagList = new TagList();
		tagList.setPage(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.Page"));
		tagList.setPageSize(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.PageSize"));
		tagList.setTotal(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.Total"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSAcrRepoTagResponse.TagList.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setDigest(_ctx.stringValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].Digest"));
			tagsItem.setImageCreate(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].ImageCreate"));
			tagsItem.setImageId(_ctx.stringValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].ImageId"));
			tagsItem.setImageSize(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].ImageSize"));
			tagsItem.setImageUpdate(_ctx.longValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].ImageUpdate"));
			tagsItem.setStatus(_ctx.stringValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].Status"));
			tagsItem.setTag(_ctx.stringValue("ListAKSAcrRepoTagResponse.TagList.Tags["+ i +"].Tag"));

			tags.add(tagsItem);
		}
		tagList.setTags(tags);
		listAKSAcrRepoTagResponse.setTagList(tagList);
	 
	 	return listAKSAcrRepoTagResponse;
	}
}