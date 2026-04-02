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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.GetDestinationCidrBlockResponse;
import com.aliyuncs.eflo.model.v20220530.GetDestinationCidrBlockResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDestinationCidrBlockResponseUnmarshaller {

	public static GetDestinationCidrBlockResponse unmarshall(GetDestinationCidrBlockResponse getDestinationCidrBlockResponse, UnmarshallerContext _ctx) {
		
		getDestinationCidrBlockResponse.setRequestId(_ctx.stringValue("GetDestinationCidrBlockResponse.RequestId"));
		getDestinationCidrBlockResponse.setCode(_ctx.integerValue("GetDestinationCidrBlockResponse.Code"));
		getDestinationCidrBlockResponse.setMessage(_ctx.stringValue("GetDestinationCidrBlockResponse.Message"));
		getDestinationCidrBlockResponse.setAccessDeniedDetail(_ctx.stringValue("GetDestinationCidrBlockResponse.AccessDeniedDetail"));

		Content content = new Content();

		List<String> destinationCidrBlock = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDestinationCidrBlockResponse.Content.DestinationCidrBlock.Length"); i++) {
			destinationCidrBlock.add(_ctx.stringValue("GetDestinationCidrBlockResponse.Content.DestinationCidrBlock["+ i +"]"));
		}
		content.setDestinationCidrBlock(destinationCidrBlock);
		getDestinationCidrBlockResponse.setContent(content);
	 
	 	return getDestinationCidrBlockResponse;
	}
}