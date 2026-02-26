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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeCharsetResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeCharsetResponse.CharsetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCharsetResponseUnmarshaller {

	public static DescribeCharsetResponse unmarshall(DescribeCharsetResponse describeCharsetResponse, UnmarshallerContext _ctx) {
		
		describeCharsetResponse.setRequestId(_ctx.stringValue("DescribeCharsetResponse.RequestId"));

		List<CharsetItem> charset = new ArrayList<CharsetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCharsetResponse.Charset.Length"); i++) {
			CharsetItem charsetItem = new CharsetItem();
			charsetItem.setCharset(_ctx.stringValue("DescribeCharsetResponse.Charset["+ i +"].Charset"));

			List<String> collations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCharsetResponse.Charset["+ i +"].Collations.Length"); j++) {
				collations.add(_ctx.stringValue("DescribeCharsetResponse.Charset["+ i +"].Collations["+ j +"]"));
			}
			charsetItem.setCollations(collations);

			charset.add(charsetItem);
		}
		describeCharsetResponse.setCharset(charset);
	 
	 	return describeCharsetResponse;
	}
}