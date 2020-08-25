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

import com.aliyuncs.sofa.model.v20190815.ListClriskSceneNamesResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskSceneNamesResponse.SceneNameInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskSceneNamesResponse.SceneNameInfosItem.SonSceneNameInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskSceneNamesResponse.SceneNameInfosItem.SonSceneNameInfosItem.LeafSceneNameInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskSceneNamesResponseUnmarshaller {

	public static ListClriskSceneNamesResponse unmarshall(ListClriskSceneNamesResponse listClriskSceneNamesResponse, UnmarshallerContext _ctx) {
		
		listClriskSceneNamesResponse.setRequestId(_ctx.stringValue("ListClriskSceneNamesResponse.RequestId"));
		listClriskSceneNamesResponse.setResultCode(_ctx.stringValue("ListClriskSceneNamesResponse.ResultCode"));
		listClriskSceneNamesResponse.setResultMessage(_ctx.stringValue("ListClriskSceneNamesResponse.ResultMessage"));
		listClriskSceneNamesResponse.setName(_ctx.stringValue("ListClriskSceneNamesResponse.Name"));
		listClriskSceneNamesResponse.setProductId(_ctx.longValue("ListClriskSceneNamesResponse.ProductId"));

		List<SceneNameInfosItem> sceneNameInfos = new ArrayList<SceneNameInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskSceneNamesResponse.SceneNameInfos.Length"); i++) {
			SceneNameInfosItem sceneNameInfosItem = new SceneNameInfosItem();
			sceneNameInfosItem.setName(_ctx.stringValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].Name"));
			sceneNameInfosItem.setProductId(_ctx.longValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].ProductId"));

			List<SonSceneNameInfosItem> sonSceneNameInfos = new ArrayList<SonSceneNameInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos.Length"); j++) {
				SonSceneNameInfosItem sonSceneNameInfosItem = new SonSceneNameInfosItem();
				sonSceneNameInfosItem.setName(_ctx.stringValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos["+ j +"].Name"));
				sonSceneNameInfosItem.setProductId(_ctx.longValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos["+ j +"].ProductId"));

				List<LeafSceneNameInfosItem> leafSceneNameInfos = new ArrayList<LeafSceneNameInfosItem>();
				for (int k = 0; k < _ctx.lengthValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos["+ j +"].LeafSceneNameInfos.Length"); k++) {
					LeafSceneNameInfosItem leafSceneNameInfosItem = new LeafSceneNameInfosItem();
					leafSceneNameInfosItem.setName(_ctx.stringValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos["+ j +"].LeafSceneNameInfos["+ k +"].Name"));
					leafSceneNameInfosItem.setProductId(_ctx.longValue("ListClriskSceneNamesResponse.SceneNameInfos["+ i +"].SonSceneNameInfos["+ j +"].LeafSceneNameInfos["+ k +"].ProductId"));

					leafSceneNameInfos.add(leafSceneNameInfosItem);
				}
				sonSceneNameInfosItem.setLeafSceneNameInfos(leafSceneNameInfos);

				sonSceneNameInfos.add(sonSceneNameInfosItem);
			}
			sceneNameInfosItem.setSonSceneNameInfos(sonSceneNameInfos);

			sceneNameInfos.add(sceneNameInfosItem);
		}
		listClriskSceneNamesResponse.setSceneNameInfos(sceneNameInfos);
	 
	 	return listClriskSceneNamesResponse;
	}
}