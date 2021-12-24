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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayBlockVolumesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayBlockVolumesResponse.BlockVolume;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayBlockVolumesResponseUnmarshaller {

	public static DescribeGatewayBlockVolumesResponse unmarshall(DescribeGatewayBlockVolumesResponse describeGatewayBlockVolumesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayBlockVolumesResponse.setRequestId(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.RequestId"));
		describeGatewayBlockVolumesResponse.setMessage(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.Message"));
		describeGatewayBlockVolumesResponse.setCode(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.Code"));
		describeGatewayBlockVolumesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayBlockVolumesResponse.Success"));

		List<BlockVolume> blockVolumes = new ArrayList<BlockVolume>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayBlockVolumesResponse.BlockVolumes.Length"); i++) {
			BlockVolume blockVolume = new BlockVolume();
			blockVolume.setStatus(_ctx.integerValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Status"));
			blockVolume.setSerialNumber(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].SerialNumber"));
			blockVolume.setChunkSize(_ctx.integerValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].ChunkSize"));
			blockVolume.setTotalUpload(_ctx.longValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].TotalUpload"));
			blockVolume.setDiskType(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].DiskType"));
			blockVolume.setDiskId(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].DiskId"));
			blockVolume.setPort(_ctx.integerValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Port"));
			blockVolume.setIndexId(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].IndexId"));
			blockVolume.setChapOutUser(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].ChapOutUser"));
			blockVolume.setTotalDownload(_ctx.longValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].TotalDownload"));
			blockVolume.setChapEnabled(_ctx.booleanValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].ChapEnabled"));
			blockVolume.setEnabled(_ctx.booleanValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Enabled"));
			blockVolume.setAddress(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Address"));
			blockVolume.setName(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Name"));
			blockVolume.setTarget(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Target"));
			blockVolume.setOssEndpoint(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].OssEndpoint"));
			blockVolume.setOssBucketName(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].OssBucketName"));
			blockVolume.setCacheMode(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].CacheMode"));
			blockVolume.setState(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].State"));
			blockVolume.setBizProtocol(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Protocol"));
			blockVolume.setLunId(_ctx.integerValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].LunId"));
			blockVolume.setOssBucketSsl(_ctx.booleanValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].OssBucketSsl"));
			blockVolume.setVolumeState(_ctx.integerValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].VolumeState"));
			blockVolume.setLocalPath(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].LocalPath"));
			blockVolume.setChapInUser(_ctx.stringValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].ChapInUser"));
			blockVolume.setSize(_ctx.longValue("DescribeGatewayBlockVolumesResponse.BlockVolumes["+ i +"].Size"));

			blockVolumes.add(blockVolume);
		}
		describeGatewayBlockVolumesResponse.setBlockVolumes(blockVolumes);
	 
	 	return describeGatewayBlockVolumesResponse;
	}
}