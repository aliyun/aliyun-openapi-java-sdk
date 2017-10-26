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

import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoFacesResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoFacesResponse.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhotoFacesResponseUnmarshaller {

	public static ListPhotoFacesResponse unmarshall(ListPhotoFacesResponse listPhotoFacesResponse, UnmarshallerContext context) {
		
		listPhotoFacesResponse.setRequestId(context.stringValue("ListPhotoFacesResponse.RequestId"));
		listPhotoFacesResponse.setCode(context.stringValue("ListPhotoFacesResponse.Code"));
		listPhotoFacesResponse.setMessage(context.stringValue("ListPhotoFacesResponse.Message"));
		listPhotoFacesResponse.setAction(context.stringValue("ListPhotoFacesResponse.Action"));

		List<Face> faces = new ArrayList<Face>();
		for (int i = 0; i < context.lengthValue("ListPhotoFacesResponse.Faces.Length"); i++) {
			Face face = new Face();
			face.setFaceId(context.longValue("ListPhotoFacesResponse.Faces["+ i +"].FaceId"));
			face.setFaceName(context.stringValue("ListPhotoFacesResponse.Faces["+ i +"].FaceName"));

			List<String> axis = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPhotoFacesResponse.Faces["+ i +"].Axis.Length"); j++) {
				axis.add(context.stringValue("ListPhotoFacesResponse.Faces["+ i +"].Axis["+ j +"]"));
			}
			face.setAxis(axis);

			faces.add(face);
		}
		listPhotoFacesResponse.setFaces(faces);
	 
	 	return listPhotoFacesResponse;
	}
}