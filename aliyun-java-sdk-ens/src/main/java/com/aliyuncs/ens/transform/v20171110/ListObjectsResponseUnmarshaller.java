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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.ListObjectsResponse;
import com.aliyuncs.ens.model.v20171110.ListObjectsResponse.CommonPrefixInfo;
import com.aliyuncs.ens.model.v20171110.ListObjectsResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListObjectsResponseUnmarshaller {

	public static ListObjectsResponse unmarshall(ListObjectsResponse listObjectsResponse, UnmarshallerContext _ctx) {
		
		listObjectsResponse.setRequestId(_ctx.stringValue("ListObjectsResponse.RequestId"));
		listObjectsResponse.setNextContinuationToken(_ctx.stringValue("ListObjectsResponse.NextContinuationToken"));
		listObjectsResponse.setContinuationToken(_ctx.stringValue("ListObjectsResponse.ContinuationToken"));
		listObjectsResponse.setDelimiter(_ctx.stringValue("ListObjectsResponse.Delimiter"));
		listObjectsResponse.setEncodingType(_ctx.stringValue("ListObjectsResponse.EncodingType"));
		listObjectsResponse.setPrefix(_ctx.stringValue("ListObjectsResponse.Prefix"));
		listObjectsResponse.setMarker(_ctx.stringValue("ListObjectsResponse.Marker"));
		listObjectsResponse.setBucketName(_ctx.stringValue("ListObjectsResponse.BucketName"));
		listObjectsResponse.setIsTruncated(_ctx.booleanValue("ListObjectsResponse.IsTruncated"));
		listObjectsResponse.setKeyCount(_ctx.longValue("ListObjectsResponse.KeyCount"));
		listObjectsResponse.setNextMarker(_ctx.stringValue("ListObjectsResponse.NextMarker"));
		listObjectsResponse.setMaxKeys(_ctx.longValue("ListObjectsResponse.MaxKeys"));

		List<String> commonPrefixes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListObjectsResponse.CommonPrefixes.Length"); i++) {
			commonPrefixes.add(_ctx.stringValue("ListObjectsResponse.CommonPrefixes["+ i +"]"));
		}
		listObjectsResponse.setCommonPrefixes(commonPrefixes);

		List<Content> contents = new ArrayList<Content>();
		for (int i = 0; i < _ctx.lengthValue("ListObjectsResponse.Contents.Length"); i++) {
			Content content = new Content();
			content.setKey(_ctx.stringValue("ListObjectsResponse.Contents["+ i +"].Key"));
			content.setLastModified(_ctx.stringValue("ListObjectsResponse.Contents["+ i +"].LastModified"));
			content.setStorageClass(_ctx.stringValue("ListObjectsResponse.Contents["+ i +"].StorageClass"));
			content.setETag(_ctx.stringValue("ListObjectsResponse.Contents["+ i +"].ETag"));
			content.setSize(_ctx.longValue("ListObjectsResponse.Contents["+ i +"].Size"));

			contents.add(content);
		}
		listObjectsResponse.setContents(contents);

		List<CommonPrefixInfo> commonPrefixInfos = new ArrayList<CommonPrefixInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListObjectsResponse.CommonPrefixInfos.Length"); i++) {
			CommonPrefixInfo commonPrefixInfo = new CommonPrefixInfo();
			commonPrefixInfo.setPrefix(_ctx.stringValue("ListObjectsResponse.CommonPrefixInfos["+ i +"].Prefix"));
			commonPrefixInfo.setLastModified(_ctx.stringValue("ListObjectsResponse.CommonPrefixInfos["+ i +"].LastModified"));

			commonPrefixInfos.add(commonPrefixInfo);
		}
		listObjectsResponse.setCommonPrefixInfos(commonPrefixInfos);
	 
	 	return listObjectsResponse;
	}
}