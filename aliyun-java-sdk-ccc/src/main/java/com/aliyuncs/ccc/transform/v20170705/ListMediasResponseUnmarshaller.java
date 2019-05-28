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

	public static ListMediasResponse unmarshall(ListMediasResponse listMediasResponse, UnmarshallerContext context) {
		
		listMediasResponse.setRequestId(context.stringValue("ListMediasResponse.RequestId"));
		listMediasResponse.setSuccess(context.booleanValue("ListMediasResponse.Success"));
		listMediasResponse.setCode(context.stringValue("ListMediasResponse.Code"));
		listMediasResponse.setMessage(context.stringValue("ListMediasResponse.Message"));
		listMediasResponse.setHttpStatusCode(context.integerValue("ListMediasResponse.HttpStatusCode"));

		Medias medias = new Medias();
		medias.setTotalCount(context.integerValue("ListMediasResponse.Medias.TotalCount"));
		medias.setPageNumber(context.integerValue("ListMediasResponse.Medias.PageNumber"));
		medias.setPageSize(context.integerValue("ListMediasResponse.Medias.PageSize"));

		List<Media> list = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("ListMediasResponse.Medias.List.Length"); i++) {
			Media media = new Media();
			media.setInstance(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Instance"));
			media.setName(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Name"));
			media.setDescription(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Description"));
			media.setType(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Type"));
			media.setContent(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Content"));
			media.setFilePath(context.stringValue("ListMediasResponse.Medias.List["+ i +"].FilePath"));
			media.setFileName(context.stringValue("ListMediasResponse.Medias.List["+ i +"].FileName"));
			media.setOssFileName(context.stringValue("ListMediasResponse.Medias.List["+ i +"].OssFileName"));
			media.setStatus(context.stringValue("ListMediasResponse.Medias.List["+ i +"].Status"));

			list.add(media);
		}
		medias.setList(list);
		listMediasResponse.setMedias(medias);
	 
	 	return listMediasResponse;
	}
}