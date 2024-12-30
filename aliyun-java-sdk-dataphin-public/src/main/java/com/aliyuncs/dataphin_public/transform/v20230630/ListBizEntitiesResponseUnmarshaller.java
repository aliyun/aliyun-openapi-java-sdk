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

import com.aliyuncs.dataphin_public.model.v20230630.ListBizEntitiesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListBizEntitiesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListBizEntitiesResponse.PageResult.BizEntityInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBizEntitiesResponseUnmarshaller {

	public static ListBizEntitiesResponse unmarshall(ListBizEntitiesResponse listBizEntitiesResponse, UnmarshallerContext _ctx) {
		
		listBizEntitiesResponse.setRequestId(_ctx.stringValue("ListBizEntitiesResponse.RequestId"));
		listBizEntitiesResponse.setSuccess(_ctx.booleanValue("ListBizEntitiesResponse.Success"));
		listBizEntitiesResponse.setHttpStatusCode(_ctx.integerValue("ListBizEntitiesResponse.HttpStatusCode"));
		listBizEntitiesResponse.setCode(_ctx.stringValue("ListBizEntitiesResponse.Code"));
		listBizEntitiesResponse.setMessage(_ctx.stringValue("ListBizEntitiesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListBizEntitiesResponse.PageResult.TotalCount"));

		List<BizEntityInfo> bizEntityList = new ArrayList<BizEntityInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBizEntitiesResponse.PageResult.BizEntityList.Length"); i++) {
			BizEntityInfo bizEntityInfo = new BizEntityInfo();
			bizEntityInfo.setId(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].Id"));
			bizEntityInfo.setName(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].Name"));
			bizEntityInfo.setDisplayName(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].DisplayName"));
			bizEntityInfo.setDescription(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].Description"));
			bizEntityInfo.setOwnerUserId(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].OwnerUserId"));
			bizEntityInfo.setOwnerName(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].OwnerName"));
			bizEntityInfo.setType(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].Type"));
			bizEntityInfo.setSubType(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].SubType"));
			bizEntityInfo.setDataDomainId(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].DataDomainId"));
			bizEntityInfo.setBizUnitId(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].BizUnitId"));
			bizEntityInfo.setGmtCreate(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].GmtCreate"));
			bizEntityInfo.setGmtModified(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].GmtModified"));
			bizEntityInfo.setLastModifier(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].LastModifier"));
			bizEntityInfo.setLastModifierName(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].LastModifierName"));
			bizEntityInfo.setOnlineStatus(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].OnlineStatus"));
			bizEntityInfo.setStatus(_ctx.stringValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].Status"));
			bizEntityInfo.setRefTableCount(_ctx.integerValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].RefTableCount"));
			bizEntityInfo.setHasChildBizEntity(_ctx.booleanValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].HasChildBizEntity"));
			bizEntityInfo.setLevelSubBizObject(_ctx.booleanValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].LevelSubBizObject"));

			List<Long> refBizEntityIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].RefBizEntityIdList.Length"); j++) {
				refBizEntityIdList.add(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].RefBizEntityIdList["+ j +"]"));
			}
			bizEntityInfo.setRefBizEntityIdList(refBizEntityIdList);

			List<Long> belongToBizEntityIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].BelongToBizEntityIdList.Length"); j++) {
				belongToBizEntityIdList.add(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].BelongToBizEntityIdList["+ j +"]"));
			}
			bizEntityInfo.setBelongToBizEntityIdList(belongToBizEntityIdList);

			List<Long> childBizEntityIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].ChildBizEntityIdList.Length"); j++) {
				childBizEntityIdList.add(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].ChildBizEntityIdList["+ j +"]"));
			}
			bizEntityInfo.setChildBizEntityIdList(childBizEntityIdList);

			List<Long> suffixBizEntityIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].SuffixBizEntityIdList.Length"); j++) {
				suffixBizEntityIdList.add(_ctx.longValue("ListBizEntitiesResponse.PageResult.BizEntityList["+ i +"].SuffixBizEntityIdList["+ j +"]"));
			}
			bizEntityInfo.setSuffixBizEntityIdList(suffixBizEntityIdList);

			bizEntityList.add(bizEntityInfo);
		}
		pageResult.setBizEntityList(bizEntityList);
		listBizEntitiesResponse.setPageResult(pageResult);
	 
	 	return listBizEntitiesResponse;
	}
}