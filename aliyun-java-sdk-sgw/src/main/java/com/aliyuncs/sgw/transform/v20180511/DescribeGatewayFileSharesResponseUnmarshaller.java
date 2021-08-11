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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayFileSharesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayFileSharesResponse.FileShare;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayFileSharesResponseUnmarshaller {

	public static DescribeGatewayFileSharesResponse unmarshall(DescribeGatewayFileSharesResponse describeGatewayFileSharesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayFileSharesResponse.setRequestId(_ctx.stringValue("DescribeGatewayFileSharesResponse.RequestId"));
		describeGatewayFileSharesResponse.setMessage(_ctx.stringValue("DescribeGatewayFileSharesResponse.Message"));
		describeGatewayFileSharesResponse.setCode(_ctx.stringValue("DescribeGatewayFileSharesResponse.Code"));
		describeGatewayFileSharesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayFileSharesResponse.Success"));

		List<FileShare> fileShares = new ArrayList<FileShare>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayFileSharesResponse.FileShares.Length"); i++) {
			FileShare fileShare = new FileShare();
			fileShare.setSerialNumber(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SerialNumber"));
			fileShare.setClientSideCmk(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ClientSideCmk"));
			fileShare.setPartialSyncPaths(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PartialSyncPaths"));
			fileShare.setPathPrefix(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PathPrefix"));
			fileShare.setBucketsStub(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BucketsStub"));
			fileShare.setUploadQueue(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].UploadQueue"));
			fileShare.setDiskId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DiskId"));
			fileShare.setOssUsed(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssUsed"));
			fileShare.setDownloadQueue(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadQueue"));
			fileShare.setActiveMessages(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ActiveMessages"));
			fileShare.setIndexId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].IndexId"));
			fileShare.setMnsHealth(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].MnsHealth"));
			fileShare.setAccessBasedEnumeration(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].AccessBasedEnumeration"));
			fileShare.setDownloadRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadRate"));
			fileShare.setFeLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FeLimit"));
			fileShare.setSupportArchive(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SupportArchive"));
			fileShare.setOssEndpoint(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssEndpoint"));
			fileShare.setOssHealth(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssHealth"));
			fileShare.setOutRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OutRate"));
			fileShare.setServerSideCmk(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ServerSideCmk"));
			fileShare.setRwClientList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RwClientList"));
			fileShare.setState(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].State"));
			fileShare.setBizProtocol(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Protocol"));
			fileShare.setOssBucketSsl(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssBucketSsl"));
			fileShare.setDownloadLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadLimit"));
			fileShare.setInPlace(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].InPlace"));
			fileShare.setRemoteSync(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemoteSync"));
			fileShare.setFileNumLimit(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FileNumLimit"));
			fileShare.setSquash(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Squash"));
			fileShare.setNfsFullPath(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].NfsFullPath"));
			fileShare.setRemainingMetaSpace(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemainingMetaSpace"));
			fileShare.setTransferAcceleration(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TransferAcceleration"));
			fileShare.setSize(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Size"));
			fileShare.setServerSideEncryption(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ServerSideEncryption"));
			fileShare.setWindowsAcl(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].WindowsAcl"));
			fileShare.setRemoteSyncDownload(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemoteSyncDownload"));
			fileShare.setClientSideEncryption(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ClientSideEncryption"));
			fileShare.setBucketInfos(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BucketInfos"));
			fileShare.setNfsV4Optimization(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].NfsV4Optimization"));
			fileShare.setTotalUpload(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TotalUpload"));
			fileShare.setDiskType(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DiskType"));
			fileShare.setUsed(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Used"));
			fileShare.setIgnoreDelete(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].IgnoreDelete"));
			fileShare.setRoUserList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RoUserList"));
			fileShare.setFsSizeLimit(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FsSizeLimit"));
			fileShare.setTotalDownload(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TotalDownload"));
			fileShare.setEnabled(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Enabled"));
			fileShare.setHighWatermark(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].HighWatermark"));
			fileShare.setKmsRotatePeriod(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].KmsRotatePeriod"));
			fileShare.setAddress(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Address"));
			fileShare.setPollingInterval(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PollingInterval"));
			fileShare.setName(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Name"));
			fileShare.setOssBucketName(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssBucketName"));
			fileShare.setExpressSyncId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ExpressSyncId"));
			fileShare.setLagPeriod(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].LagPeriod"));
			fileShare.setDirectIO(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DirectIO"));
			fileShare.setCacheMode(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].CacheMode"));
			fileShare.setInRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].InRate"));
			fileShare.setLowWatermark(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].LowWatermark"));
			fileShare.setSyncProgress(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SyncProgress"));
			fileShare.setServerSideAlgorithm(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ServerSideAlgorithm"));
			fileShare.setObsoleteBuckets(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ObsoleteBuckets"));
			fileShare.setBeLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BeLimit"));
			fileShare.setLocalPath(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].LocalPath"));
			fileShare.setRoClientList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RoClientList"));
			fileShare.setRwUserList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RwUserList"));
			fileShare.setFastReclaim(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FastReclaim"));
			fileShare.setBrowsable(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Browsable"));
			fileShare.setThrottling(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Throttling"));
			fileShare.setBypassCacheRead(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BypassCacheRead"));

			fileShares.add(fileShare);
		}
		describeGatewayFileSharesResponse.setFileShares(fileShares);
	 
	 	return describeGatewayFileSharesResponse;
	}
}