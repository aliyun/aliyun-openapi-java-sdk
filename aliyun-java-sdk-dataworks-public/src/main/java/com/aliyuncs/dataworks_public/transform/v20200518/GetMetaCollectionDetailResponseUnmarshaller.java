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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaCollectionDetailResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaCollectionDetailResponse.Collection;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaCollectionDetailResponseUnmarshaller {

	public static GetMetaCollectionDetailResponse unmarshall(GetMetaCollectionDetailResponse getMetaCollectionDetailResponse, UnmarshallerContext _ctx) {
		
		getMetaCollectionDetailResponse.setRequestId(_ctx.stringValue("GetMetaCollectionDetailResponse.RequestId"));
		getMetaCollectionDetailResponse.setSuccess(_ctx.booleanValue("GetMetaCollectionDetailResponse.Success"));
		getMetaCollectionDetailResponse.setErrorCode(_ctx.stringValue("GetMetaCollectionDetailResponse.ErrorCode"));
		getMetaCollectionDetailResponse.setErrorMessage(_ctx.stringValue("GetMetaCollectionDetailResponse.ErrorMessage"));
		getMetaCollectionDetailResponse.setHttpStatusCode(_ctx.integerValue("GetMetaCollectionDetailResponse.HttpStatusCode"));

		Collection collection = new Collection();
		collection.setQualifiedName(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.QualifiedName"));
		collection.setCollectionType(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.CollectionType"));
		collection.setName(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.Name"));
		collection.setComment(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.Comment"));
		collection.setOwnerId(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.OwnerId"));
		collection.setOwnerName(_ctx.stringValue("GetMetaCollectionDetailResponse.Collection.OwnerName"));
		collection.setCreateTime(_ctx.longValue("GetMetaCollectionDetailResponse.Collection.CreateTime"));
		collection.setUpdateTime(_ctx.longValue("GetMetaCollectionDetailResponse.Collection.UpdateTime"));
		collection.setLevel(_ctx.integerValue("GetMetaCollectionDetailResponse.Collection.Level"));
		getMetaCollectionDetailResponse.setCollection(collection);
	 
	 	return getMetaCollectionDetailResponse;
	}
}