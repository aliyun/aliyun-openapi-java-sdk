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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListMediasResponse;
import com.aliyuncs.ccc.model.v20170705.ListMediasResponse.Medias;
import com.aliyuncs.ccc.model.v20170705.ListMediasResponse.Medias.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediasResponseUnmarshaller {

	public static ListMediasResponse unmarshall(ListMediasResponse listMediasResponse, UnmarshallerContext _ctx) {
		
		listMediasResponse.setRequestId(_ctx.stringValue("ListMediasResponse.RequestId"));
		listMediasResponse.setHttpStatusCode(_ctx.integerValue("ListMediasResponse.HttpStatusCode"));
		listMediasResponse.setCode(_ctx.stringValue("ListMediasResponse.Code"));
		listMediasResponse.setMessage(_ctx.stringValue("ListMediasResponse.Message"));
		listMediasResponse.setSuccess(_ctx.booleanValue("ListMediasResponse.Success"));

		Medias medias = new Medias();
		medias.setPageNumber(_ctx.integerValue("ListMediasResponse.Medias.PageNumber"));
		medias.setPageSize(_ctx.integerValue("ListMediasResponse.Medias.PageSize"));
		medias.setTotalCount(_ctx.integerValue("ListMediasResponse.Medias.TotalCount"));

		List<Media> list = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediasResponse.Medias.List.Length"); i++) {
			Media media = new Media();
			media.setStatus(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Status"));
			media.setType(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Type"));
			media.setFilePath(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].FilePath"));
			media.setInstance(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Instance"));
			media.setDescription(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Description"));
			media.setFileName(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].FileName"));
			media.setName(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Name"));
			media.setContent(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].Content"));
			media.setOssFileName(_ctx.stringValue("ListMediasResponse.Medias.List["+ i +"].OssFileName"));

			list.add(media);
		}
		medias.setList(list);
		listMediasResponse.setMedias(medias);
	 
	 	return listMediasResponse;
	}
}