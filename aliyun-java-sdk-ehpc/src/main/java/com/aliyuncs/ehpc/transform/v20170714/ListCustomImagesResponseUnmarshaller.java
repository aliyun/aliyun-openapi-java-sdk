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
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListCustomImagesResponse;
import com.aliyuncs.ehpc.model.v20170714.ListCustomImagesResponse.ImageInfo;
import com.aliyuncs.ehpc.model.v20170714.ListCustomImagesResponse.ImageInfo.BaseOsTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImagesResponseUnmarshaller {

	public static ListCustomImagesResponse unmarshall(ListCustomImagesResponse listCustomImagesResponse, UnmarshallerContext context) {
		
		listCustomImagesResponse.setRequestId(context.stringValue("ListCustomImagesResponse.RequestId"));

		List<ImageInfo> images = new ArrayList<ImageInfo>();
		for (int i = 0; i < context.lengthValue("ListCustomImagesResponse.Images.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setImageId(context.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageId"));
			imageInfo.setImageName(context.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageName"));
			imageInfo.setImageOwnerAlias(context.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			imageInfo.setDescription(context.stringValue("ListCustomImagesResponse.Images["+ i +"].Description"));

			BaseOsTag baseOsTag = new BaseOsTag();
			baseOsTag.setOsTag(context.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.OsTag"));
			baseOsTag.setPlatform(context.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Platform"));
			baseOsTag.setVersion(context.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Version"));
			baseOsTag.setArchitecture(context.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Architecture"));
			imageInfo.setBaseOsTag(baseOsTag);

			images.add(imageInfo);
		}
		listCustomImagesResponse.setImages(images);
	 
	 	return listCustomImagesResponse;
	}
}