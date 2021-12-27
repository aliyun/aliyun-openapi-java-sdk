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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnEsExecuteDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnEsExecuteDataResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnEsExecuteDataResponseUnmarshaller {

	public static DescribeDcdnEsExecuteDataResponse unmarshall(DescribeDcdnEsExecuteDataResponse describeDcdnEsExecuteDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnEsExecuteDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnEsExecuteDataResponse.RequestId"));

		List<Content> contents = new ArrayList<Content>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnEsExecuteDataResponse.Contents.Length"); i++) {
			Content content = new Content();
			content.setName(_ctx.stringValue("DescribeDcdnEsExecuteDataResponse.Contents["+ i +"].Name"));

			List<String> columns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnEsExecuteDataResponse.Contents["+ i +"].Columns.Length"); j++) {
				columns.add(_ctx.stringValue("DescribeDcdnEsExecuteDataResponse.Contents["+ i +"].Columns["+ j +"]"));
			}
			content.setColumns(columns);

			List<String> points = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnEsExecuteDataResponse.Contents["+ i +"].Points.Length"); j++) {
				points.add(_ctx.stringValue("DescribeDcdnEsExecuteDataResponse.Contents["+ i +"].Points["+ j +"]"));
			}
			content.setPoints(points);

			contents.add(content);
		}
		describeDcdnEsExecuteDataResponse.setContents(contents);
	 
	 	return describeDcdnEsExecuteDataResponse;
	}
}