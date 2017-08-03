/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.ListFacesResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListFacesResponse.Face;
import com.aliyuncs.cloudphoto.model.v20170711.ListFacesResponse.Face.Cover;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFacesResponseUnmarshaller {

	public static ListFacesResponse unmarshall(ListFacesResponse listFacesResponse, UnmarshallerContext context) {
		
		listFacesResponse.setRequestId(context.stringValue("ListFacesResponse.RequestId"));
		listFacesResponse.setCode(context.stringValue("ListFacesResponse.Code"));
		listFacesResponse.setMessage(context.stringValue("ListFacesResponse.Message"));
		listFacesResponse.setNextCursor(context.stringValue("ListFacesResponse.NextCursor"));
		listFacesResponse.setTotalCount(context.integerValue("ListFacesResponse.TotalCount"));
		listFacesResponse.setAction(context.stringValue("ListFacesResponse.Action"));

		List<Face> faces = new ArrayList<Face>();
		for (int i = 0; i < context.lengthValue("ListFacesResponse.Faces.Length"); i++) {
			Face face = new Face();
			face.setId(context.longValue("ListFacesResponse.Faces["+ i +"].Id"));
			face.setName(context.stringValue("ListFacesResponse.Faces["+ i +"].Name"));
			face.setPhotosCount(context.integerValue("ListFacesResponse.Faces["+ i +"].PhotosCount"));
			face.setState(context.stringValue("ListFacesResponse.Faces["+ i +"].State"));
			face.setIsMe(context.booleanValue("ListFacesResponse.Faces["+ i +"].IsMe"));
			face.setCtime(context.longValue("ListFacesResponse.Faces["+ i +"].Ctime"));
			face.setMtime(context.longValue("ListFacesResponse.Faces["+ i +"].Mtime"));

			List<String> axis = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFacesResponse.Faces["+ i +"].Axis.Length"); j++) {
				axis.add(context.stringValue("ListFacesResponse.Faces["+ i +"].Axis["+ j +"]"));
			}
			face.setAxis(axis);

			Cover cover = new Cover();
			cover.setId(context.longValue("ListFacesResponse.Faces["+ i +"].Cover.Id"));
			cover.setTitle(context.stringValue("ListFacesResponse.Faces["+ i +"].Cover.Title"));
			cover.setFileId(context.stringValue("ListFacesResponse.Faces["+ i +"].Cover.FileId"));
			cover.setState(context.stringValue("ListFacesResponse.Faces["+ i +"].Cover.State"));
			cover.setMd5(context.stringValue("ListFacesResponse.Faces["+ i +"].Cover.Md5"));
			cover.setIsVideo(context.booleanValue("ListFacesResponse.Faces["+ i +"].Cover.IsVideo"));
			cover.setWidth(context.longValue("ListFacesResponse.Faces["+ i +"].Cover.Width"));
			cover.setHeight(context.longValue("ListFacesResponse.Faces["+ i +"].Cover.Height"));
			cover.setCtime(context.longValue("ListFacesResponse.Faces["+ i +"].Cover.Ctime"));
			cover.setMtime(context.longValue("ListFacesResponse.Faces["+ i +"].Cover.Mtime"));
			face.setCover(cover);

			faces.add(face);
		}
		listFacesResponse.setFaces(faces);
	 
	 	return listFacesResponse;
	}
}