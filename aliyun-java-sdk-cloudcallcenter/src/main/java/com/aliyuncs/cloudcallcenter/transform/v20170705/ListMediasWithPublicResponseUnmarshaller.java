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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListMediasWithPublicResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListMediasWithPublicResponse.Medias;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListMediasWithPublicResponse.Medias.Media;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListMediasWithPublicResponse.PublicMedia;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediasWithPublicResponseUnmarshaller {

	public static ListMediasWithPublicResponse unmarshall(ListMediasWithPublicResponse listMediasWithPublicResponse, UnmarshallerContext context) {
		
		listMediasWithPublicResponse.setRequestId(context.stringValue("ListMediasWithPublicResponse.RequestId"));
		listMediasWithPublicResponse.setSuccess(context.booleanValue("ListMediasWithPublicResponse.Success"));
		listMediasWithPublicResponse.setCode(context.stringValue("ListMediasWithPublicResponse.Code"));
		listMediasWithPublicResponse.setMessage(context.stringValue("ListMediasWithPublicResponse.Message"));
		listMediasWithPublicResponse.setHttpStatusCode(context.integerValue("ListMediasWithPublicResponse.HttpStatusCode"));

		Medias medias = new Medias();
		medias.setTotalCount(context.integerValue("ListMediasWithPublicResponse.Medias.TotalCount"));
		medias.setPageNumber(context.integerValue("ListMediasWithPublicResponse.Medias.PageNumber"));
		medias.setPageSize(context.integerValue("ListMediasWithPublicResponse.Medias.PageSize"));

		List<Media> list = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("ListMediasWithPublicResponse.Medias.List.Length"); i++) {
			Media media = new Media();
			media.setInstance(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Instance"));
			media.setName(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Name"));
			media.setDescription(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Description"));
			media.setType(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Type"));
			media.setContent(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Content"));
			media.setFilePath(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].FilePath"));
			media.setFileName(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].FileName"));
			media.setOssFileName(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].OssFileName"));
			media.setScope(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Scope"));
			media.setStatus(context.stringValue("ListMediasWithPublicResponse.Medias.List["+ i +"].Status"));

			list.add(media);
		}
		medias.setList(list);
		listMediasWithPublicResponse.setMedias(medias);

		List<PublicMedia> publicMedias = new ArrayList<PublicMedia>();
		for (int i = 0; i < context.lengthValue("ListMediasWithPublicResponse.PublicMedias.Length"); i++) {
			PublicMedia publicMedia = new PublicMedia();
			publicMedia.setId(context.longValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Id"));
			publicMedia.setInstance(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Instance"));
			publicMedia.setName(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Name"));
			publicMedia.setDescription(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Description"));
			publicMedia.setType(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Type"));
			publicMedia.setContent(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Content"));
			publicMedia.setFilePath(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].FilePath"));
			publicMedia.setFileName(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].FileName"));
			publicMedia.setOssFileName(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].OssFileName"));
			publicMedia.setScope(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Scope"));
			publicMedia.setStatus(context.stringValue("ListMediasWithPublicResponse.PublicMedias["+ i +"].Status"));

			publicMedias.add(publicMedia);
		}
		listMediasWithPublicResponse.setPublicMedias(publicMedias);
	 
	 	return listMediasWithPublicResponse;
	}
}