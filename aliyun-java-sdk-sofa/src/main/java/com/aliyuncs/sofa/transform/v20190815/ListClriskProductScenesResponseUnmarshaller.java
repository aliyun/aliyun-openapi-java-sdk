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

import com.aliyuncs.sofa.model.v20190815.ListClriskProductScenesResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskProductScenesResponse.SceneInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskProductScenesResponse.SceneInfosItem.SonSceneInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskProductScenesResponse.SceneInfosItem.SonSceneInfosItem.LeafSceneInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskProductScenesResponseUnmarshaller {

	public static ListClriskProductScenesResponse unmarshall(ListClriskProductScenesResponse listClriskProductScenesResponse, UnmarshallerContext _ctx) {
		
		listClriskProductScenesResponse.setRequestId(_ctx.stringValue("ListClriskProductScenesResponse.RequestId"));
		listClriskProductScenesResponse.setResultCode(_ctx.stringValue("ListClriskProductScenesResponse.ResultCode"));
		listClriskProductScenesResponse.setResultMessage(_ctx.stringValue("ListClriskProductScenesResponse.ResultMessage"));
		listClriskProductScenesResponse.setPageCount(_ctx.longValue("ListClriskProductScenesResponse.PageCount"));
		listClriskProductScenesResponse.setPageNumber(_ctx.longValue("ListClriskProductScenesResponse.PageNumber"));
		listClriskProductScenesResponse.setPageSize(_ctx.longValue("ListClriskProductScenesResponse.PageSize"));
		listClriskProductScenesResponse.setTotalCount(_ctx.longValue("ListClriskProductScenesResponse.TotalCount"));

		List<SceneInfosItem> sceneInfos = new ArrayList<SceneInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskProductScenesResponse.SceneInfos.Length"); i++) {
			SceneInfosItem sceneInfosItem = new SceneInfosItem();
			sceneInfosItem.setDescription(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].Description"));
			sceneInfosItem.setId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].Id"));
			sceneInfosItem.setModifyUser(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].ModifyUser"));
			sceneInfosItem.setName(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].Name"));
			sceneInfosItem.setParentId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].ParentId"));
			sceneInfosItem.setRelatedNodeCount(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].RelatedNodeCount"));

			List<SonSceneInfosItem> sonSceneInfos = new ArrayList<SonSceneInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos.Length"); j++) {
				SonSceneInfosItem sonSceneInfosItem = new SonSceneInfosItem();
				sonSceneInfosItem.setDescription(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].Description"));
				sonSceneInfosItem.setId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].Id"));
				sonSceneInfosItem.setModifyUser(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].ModifyUser"));
				sonSceneInfosItem.setName(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].Name"));
				sonSceneInfosItem.setParentId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].ParentId"));
				sonSceneInfosItem.setRelatedNodeCount(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].RelatedNodeCount"));

				List<LeafSceneInfosItem> leafSceneInfos = new ArrayList<LeafSceneInfosItem>();
				for (int k = 0; k < _ctx.lengthValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos.Length"); k++) {
					LeafSceneInfosItem leafSceneInfosItem = new LeafSceneInfosItem();
					leafSceneInfosItem.setDescription(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].Description"));
					leafSceneInfosItem.setId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].Id"));
					leafSceneInfosItem.setModifyUser(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].ModifyUser"));
					leafSceneInfosItem.setName(_ctx.stringValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].Name"));
					leafSceneInfosItem.setParentId(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].ParentId"));
					leafSceneInfosItem.setRelatedNodeCount(_ctx.longValue("ListClriskProductScenesResponse.SceneInfos["+ i +"].SonSceneInfos["+ j +"].LeafSceneInfos["+ k +"].RelatedNodeCount"));

					leafSceneInfos.add(leafSceneInfosItem);
				}
				sonSceneInfosItem.setLeafSceneInfos(leafSceneInfos);

				sonSceneInfos.add(sonSceneInfosItem);
			}
			sceneInfosItem.setSonSceneInfos(sonSceneInfos);

			sceneInfos.add(sceneInfosItem);
		}
		listClriskProductScenesResponse.setSceneInfos(sceneInfos);
	 
	 	return listClriskProductScenesResponse;
	}
}