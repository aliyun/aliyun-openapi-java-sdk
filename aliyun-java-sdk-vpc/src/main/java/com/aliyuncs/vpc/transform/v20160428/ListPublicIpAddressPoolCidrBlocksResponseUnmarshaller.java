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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListPublicIpAddressPoolCidrBlocksResponse;
import com.aliyuncs.vpc.model.v20160428.ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlock;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublicIpAddressPoolCidrBlocksResponseUnmarshaller {

	public static ListPublicIpAddressPoolCidrBlocksResponse unmarshall(ListPublicIpAddressPoolCidrBlocksResponse listPublicIpAddressPoolCidrBlocksResponse, UnmarshallerContext _ctx) {
		
		listPublicIpAddressPoolCidrBlocksResponse.setRequestId(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.RequestId"));
		listPublicIpAddressPoolCidrBlocksResponse.setNextToken(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.NextToken"));
		listPublicIpAddressPoolCidrBlocksResponse.setMaxResults(_ctx.integerValue("ListPublicIpAddressPoolCidrBlocksResponse.MaxResults"));
		listPublicIpAddressPoolCidrBlocksResponse.setTotalCount(_ctx.integerValue("ListPublicIpAddressPoolCidrBlocksResponse.TotalCount"));

		List<PublicIpPoolCidrBlock> publicIpPoolCidrBlockList = new ArrayList<PublicIpPoolCidrBlock>();
		for (int i = 0; i < _ctx.lengthValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList.Length"); i++) {
			PublicIpPoolCidrBlock publicIpPoolCidrBlock = new PublicIpPoolCidrBlock();
			publicIpPoolCidrBlock.setPublicIpAddressPoolId(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].PublicIpAddressPoolId"));
			publicIpPoolCidrBlock.setCidrBlock(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].CidrBlock"));
			publicIpPoolCidrBlock.setCreationTime(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].CreationTime"));
			publicIpPoolCidrBlock.setStatus(_ctx.stringValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].Status"));
			publicIpPoolCidrBlock.setUsedIpNum(_ctx.integerValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].UsedIpNum"));
			publicIpPoolCidrBlock.setTotalIpNum(_ctx.integerValue("ListPublicIpAddressPoolCidrBlocksResponse.PublicIpPoolCidrBlockList["+ i +"].TotalIpNum"));

			publicIpPoolCidrBlockList.add(publicIpPoolCidrBlock);
		}
		listPublicIpAddressPoolCidrBlocksResponse.setPublicIpPoolCidrBlockList(publicIpPoolCidrBlockList);
	 
	 	return listPublicIpAddressPoolCidrBlocksResponse;
	}
}