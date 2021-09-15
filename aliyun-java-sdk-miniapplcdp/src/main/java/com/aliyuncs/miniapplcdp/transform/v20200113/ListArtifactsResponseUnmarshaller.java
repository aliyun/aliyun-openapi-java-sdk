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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListArtifactsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListArtifactsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListArtifactsResponse.Data.ArtifactItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArtifactsResponseUnmarshaller {

	public static ListArtifactsResponse unmarshall(ListArtifactsResponse listArtifactsResponse, UnmarshallerContext _ctx) {
		
		listArtifactsResponse.setRequestId(_ctx.stringValue("ListArtifactsResponse.RequestId"));

		Data data = new Data();

		List<ArtifactItem> items = new ArrayList<ArtifactItem>();
		for (int i = 0; i < _ctx.lengthValue("ListArtifactsResponse.Data.Items.Length"); i++) {
			ArtifactItem artifactItem = new ArtifactItem();
			artifactItem.setArtifactId(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].ArtifactId"));
			artifactItem.setModifiedTime(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].ModifiedTime"));
			artifactItem.setAppId(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].AppId"));
			artifactItem.setCreateTime(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].CreateTime"));
			artifactItem.setArtifactType(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].ArtifactType"));
			artifactItem.setAvailable(_ctx.booleanValue("ListArtifactsResponse.Data.Items["+ i +"].Available"));
			artifactItem.setUrl(_ctx.stringValue("ListArtifactsResponse.Data.Items["+ i +"].Url"));

			items.add(artifactItem);
		}
		data.setItems(items);
		listArtifactsResponse.setData(data);
	 
	 	return listArtifactsResponse;
	}
}