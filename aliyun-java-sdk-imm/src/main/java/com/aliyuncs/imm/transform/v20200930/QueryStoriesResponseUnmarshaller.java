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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AddressesItem20;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32.CroppingSuggestionsItem36;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32.CroppingSuggestionsItem36.Boundary37;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32.ImageScore33;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32.OCRContentsItem38;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem32.OCRContentsItem38.Boundary39;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioStreamsItem31;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.CroppingSuggestionsItem25;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.CroppingSuggestionsItem25.Boundary26;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem21;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem21.Boundary22;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem21.HeadPose23;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.ImageScore10;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.LabelsItem24;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.OCRContentsItem27;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.OCRContentsItem27.Boundary28;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.SubtitlesItem30;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.VideoStreamsItem29;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AddressesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.CroppingSuggestionsItem6;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.CroppingSuggestionsItem6.Boundary7;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.ImageScore3;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.OCRContentsItem8;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.OCRContentsItem8.Boundary9;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.CroppingSuggestionsItem.Boundary1;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.ImageScore;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.LabelsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.OCRContentsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStoriesResponseUnmarshaller {

	public static QueryStoriesResponse unmarshall(QueryStoriesResponse queryStoriesResponse, UnmarshallerContext _ctx) {
		
		queryStoriesResponse.setRequestId(_ctx.stringValue("QueryStoriesResponse.RequestId"));
		queryStoriesResponse.setNextToken(_ctx.stringValue("QueryStoriesResponse.NextToken"));

		List<StoriesItem> stories = new ArrayList<StoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryStoriesResponse.Stories.Length"); i++) {
			StoriesItem storiesItem = new StoriesItem();
			storiesItem.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].OwnerId"));
			storiesItem.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ProjectName"));
			storiesItem.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].DatasetName"));
			storiesItem.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ObjectId"));
			storiesItem.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ObjectType"));
			storiesItem.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].UpdateTime"));
			storiesItem.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].CreateTime"));
			storiesItem.setStoryName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryName"));
			storiesItem.setStoryType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryType"));
			storiesItem.setStorySubType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StorySubType"));
			storiesItem.setStoryStartTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryStartTime"));
			storiesItem.setStoryEndTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryEndTime"));
			storiesItem.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].CustomId"));
			storiesItem.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].CustomLabels"));

			List<String> figureClusterIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].FigureClusterIds.Length"); j++) {
				figureClusterIds.add(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].FigureClusterIds["+ j +"]"));
			}
			storiesItem.setFigureClusterIds(figureClusterIds);

			Cover cover = new Cover();
			cover.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OwnerId"));
			cover.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProjectName"));
			cover.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.DatasetName"));
			cover.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectType"));
			cover.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectId"));
			cover.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.UpdateTime"));
			cover.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CreateTime"));
			cover.setURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.URI"));
			cover.setOSSURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSURI"));
			cover.setFilename(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Filename"));
			cover.setMediaType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.MediaType"));
			cover.setContentType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentType"));
			cover.setSize(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Size"));
			cover.setFileHash(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileHash"));
			cover.setFileModifiedTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileModifiedTime"));
			cover.setFileCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileCreateTime"));
			cover.setFileAccessTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileAccessTime"));
			cover.setProduceTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProduceTime"));
			cover.setLatLong(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.LatLong"));
			cover.setTimezone(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Timezone"));
			cover.setTravelClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.TravelClusterId"));
			cover.setOrientation(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Orientation"));
			cover.setFigureCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.FigureCount"));
			cover.setTitle(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Title"));
			cover.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageWidth"));
			cover.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageHeight"));
			cover.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.EXIF"));
			cover.setVideoWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoWidth"));
			cover.setVideoHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoHeight"));
			cover.setArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Artist"));
			cover.setAlbumArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AlbumArtist"));
			cover.setComposer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Composer"));
			cover.setPerformer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Performer"));
			cover.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Language"));
			cover.setAlbum(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Album"));
			cover.setDocumentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.DocumentLanguage"));
			cover.setPageCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.PageCount"));
			cover.setDocumentContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.DocumentContent"));
			cover.setETag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ETag"));
			cover.setCacheControl(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CacheControl"));
			cover.setContentDisposition(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentDisposition"));
			cover.setContentEncoding(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentEncoding"));
			cover.setContentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentLanguage"));
			cover.setAccessControlAllowOrigin(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AccessControlAllowOrigin"));
			cover.setAccessControlRequestMethod(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AccessControlRequestMethod"));
			cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryptionCustomerAlgorithm"));
			cover.setServerSideEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryption"));
			cover.setServerSideDataEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideDataEncryption"));
			cover.setServerSideEncryptionKeyId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryptionKeyId"));
			cover.setOSSStorageClass(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSStorageClass"));
			cover.setOSSCRC64(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSCRC64"));
			cover.setObjectACL(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectACL"));
			cover.setContentMd5(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentMd5"));
			cover.setOSSUserMeta(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSUserMeta"));
			cover.setOSSTaggingCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSTaggingCount"));
			cover.setOSSTagging(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSTagging"));
			cover.setOSSExpiration(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSExpiration"));
			cover.setOSSVersionId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSVersionId"));
			cover.setOSSDeleteMarker(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSDeleteMarker"));
			cover.setOSSObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSObjectType"));
			cover.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CustomId"));
			cover.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.CustomLabels"));
			cover.setStreamCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.StreamCount"));
			cover.setProgramCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProgramCount"));
			cover.setFormatName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FormatName"));
			cover.setFormatLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FormatLongName"));
			cover.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.StartTime"));
			cover.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Bitrate"));
			cover.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Duration"));

			ImageScore10 imageScore10 = new ImageScore10();
			imageScore10.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageScore.OverallQualityScore"));
			cover.setImageScore10(imageScore10);

			List<AddressesItem20> addresses11 = new ArrayList<AddressesItem20>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses.Length"); j++) {
				AddressesItem20 addressesItem20 = new AddressesItem20();
				addressesItem20.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Language"));
				addressesItem20.setAddressLine(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].AddressLine"));
				addressesItem20.setCountry(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Country"));
				addressesItem20.setProvince(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Province"));
				addressesItem20.setCity(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].City"));
				addressesItem20.setDistrict(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].District"));
				addressesItem20.setTownship(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Township"));

				addresses11.add(addressesItem20);
			}
			cover.setAddresses11(addresses11);

			List<FiguresItem21> figures12 = new ArrayList<FiguresItem21>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures.Length"); j++) {
				FiguresItem21 figuresItem21 = new FiguresItem21();
				figuresItem21.setFigureId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureId"));
				figuresItem21.setFigureConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureConfidence"));
				figuresItem21.setFigureClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureClusterId"));
				figuresItem21.setFigureClusterConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureClusterConfidence"));
				figuresItem21.setFigureType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureType"));
				figuresItem21.setAge(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Age"));
				figuresItem21.setAgeSD(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].AgeSD"));
				figuresItem21.setGender(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Gender"));
				figuresItem21.setGenderConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].GenderConfidence"));
				figuresItem21.setEmotion(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Emotion"));
				figuresItem21.setEmotionConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].EmotionConfidence"));
				figuresItem21.setFaceQuality(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FaceQuality"));
				figuresItem21.setMouth(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Mouth"));
				figuresItem21.setMouthConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].MouthConfidence"));
				figuresItem21.setBeard(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Beard"));
				figuresItem21.setBeardConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].BeardConfidence"));
				figuresItem21.setHat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Hat"));
				figuresItem21.setHatConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HatConfidence"));
				figuresItem21.setMask(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Mask"));
				figuresItem21.setMaskConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].MaskConfidence"));
				figuresItem21.setGlasses(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Glasses"));
				figuresItem21.setGlassesConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].GlassesConfidence"));
				figuresItem21.setSharpness(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Sharpness"));
				figuresItem21.setAttractive(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Attractive"));

				Boundary22 boundary22 = new Boundary22();
				boundary22.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Width"));
				boundary22.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Height"));
				boundary22.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Left"));
				boundary22.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Top"));
				figuresItem21.setBoundary22(boundary22);

				HeadPose23 headPose23 = new HeadPose23();
				headPose23.setPitch(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Pitch"));
				headPose23.setRoll(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Roll"));
				headPose23.setYaw(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Yaw"));
				figuresItem21.setHeadPose23(headPose23);

				figures12.add(figuresItem21);
			}
			cover.setFigures12(figures12);

			List<LabelsItem24> labels13 = new ArrayList<LabelsItem24>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels.Length"); j++) {
				LabelsItem24 labelsItem24 = new LabelsItem24();
				labelsItem24.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].Language"));
				labelsItem24.setLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelName"));
				labelsItem24.setLabelLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelLevel"));
				labelsItem24.setLabelConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelConfidence"));
				labelsItem24.setParentLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].ParentLabelName"));
				labelsItem24.setCentricScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].CentricScore"));

				labels13.add(labelsItem24);
			}
			cover.setLabels13(labels13);

			List<CroppingSuggestionsItem25> croppingSuggestions14 = new ArrayList<CroppingSuggestionsItem25>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem25 croppingSuggestionsItem25 = new CroppingSuggestionsItem25();
				croppingSuggestionsItem25.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem25.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Confidence"));

				Boundary26 boundary26 = new Boundary26();
				boundary26.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary26.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary26.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary26.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem25.setBoundary26(boundary26);

				croppingSuggestions14.add(croppingSuggestionsItem25);
			}
			cover.setCroppingSuggestions14(croppingSuggestions14);

			List<OCRContentsItem27> oCRContents15 = new ArrayList<OCRContentsItem27>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents.Length"); j++) {
				OCRContentsItem27 oCRContentsItem27 = new OCRContentsItem27();
				oCRContentsItem27.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Language"));
				oCRContentsItem27.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Contents"));
				oCRContentsItem27.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Confidence"));

				Boundary28 boundary28 = new Boundary28();
				boundary28.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Width"));
				boundary28.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Height"));
				boundary28.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Left"));
				boundary28.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem27.setBoundary28(boundary28);

				oCRContents15.add(oCRContentsItem27);
			}
			cover.setOCRContents15(oCRContents15);

			List<VideoStreamsItem29> videoStreams16 = new ArrayList<VideoStreamsItem29>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams.Length"); j++) {
				VideoStreamsItem29 videoStreamsItem29 = new VideoStreamsItem29();
				videoStreamsItem29.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Index"));
				videoStreamsItem29.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Language"));
				videoStreamsItem29.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecName"));
				videoStreamsItem29.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem29.setProfile(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Profile"));
				videoStreamsItem29.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem29.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem29.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem29.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Width"));
				videoStreamsItem29.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Height"));
				videoStreamsItem29.setHasBFrames(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem29.setSampleAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem29.setDisplayAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem29.setPixelFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem29.setLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Level"));
				videoStreamsItem29.setFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem29.setAverageFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem29.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem29.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].StartTime"));
				videoStreamsItem29.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Duration"));
				videoStreamsItem29.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem29.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem29.setRotate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Rotate"));
				videoStreamsItem29.setBitDepth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem29.setColorSpace(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem29.setColorRange(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem29.setColorTransfer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem29.setColorPrimaries(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams16.add(videoStreamsItem29);
			}
			cover.setVideoStreams16(videoStreams16);

			List<SubtitlesItem30> subtitles17 = new ArrayList<SubtitlesItem30>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles.Length"); j++) {
				SubtitlesItem30 subtitlesItem30 = new SubtitlesItem30();
				subtitlesItem30.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Index"));
				subtitlesItem30.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Language"));
				subtitlesItem30.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecName"));
				subtitlesItem30.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecLongName"));
				subtitlesItem30.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecTagString"));
				subtitlesItem30.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecTag"));
				subtitlesItem30.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].StartTime"));
				subtitlesItem30.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Duration"));
				subtitlesItem30.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Bitrate"));
				subtitlesItem30.setContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Content"));
				subtitlesItem30.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Width"));
				subtitlesItem30.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Height"));

				subtitles17.add(subtitlesItem30);
			}
			cover.setSubtitles17(subtitles17);

			List<AudioStreamsItem31> audioStreams18 = new ArrayList<AudioStreamsItem31>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams.Length"); j++) {
				AudioStreamsItem31 audioStreamsItem31 = new AudioStreamsItem31();
				audioStreamsItem31.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Index"));
				audioStreamsItem31.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Language"));
				audioStreamsItem31.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecName"));
				audioStreamsItem31.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem31.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem31.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem31.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem31.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem31.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].StartTime"));
				audioStreamsItem31.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Duration"));
				audioStreamsItem31.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem31.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem31.setLyric(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Lyric"));
				audioStreamsItem31.setSampleFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem31.setSampleRate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem31.setChannels(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Channels"));
				audioStreamsItem31.setChannelLayout(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].ChannelLayout"));

				audioStreams18.add(audioStreamsItem31);
			}
			cover.setAudioStreams18(audioStreams18);

			List<AudioCoversItem32> audioCovers19 = new ArrayList<AudioCoversItem32>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers.Length"); j++) {
				AudioCoversItem32 audioCoversItem32 = new AudioCoversItem32();
				audioCoversItem32.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem32.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem32.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].EXIF"));

				ImageScore33 imageScore33 = new ImageScore33();
				imageScore33.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem32.setImageScore33(imageScore33);

				List<CroppingSuggestionsItem36> croppingSuggestions34 = new ArrayList<CroppingSuggestionsItem36>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem36 croppingSuggestionsItem36 = new CroppingSuggestionsItem36();
					croppingSuggestionsItem36.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem36.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary37 boundary37 = new Boundary37();
					boundary37.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary37.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary37.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary37.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem36.setBoundary37(boundary37);

					croppingSuggestions34.add(croppingSuggestionsItem36);
				}
				audioCoversItem32.setCroppingSuggestions34(croppingSuggestions34);

				List<OCRContentsItem38> oCRContents35 = new ArrayList<OCRContentsItem38>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem38 oCRContentsItem38 = new OCRContentsItem38();
					oCRContentsItem38.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem38.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem38.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary39 boundary39 = new Boundary39();
					boundary39.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary39.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary39.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary39.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem38.setBoundary39(boundary39);

					oCRContents35.add(oCRContentsItem38);
				}
				audioCoversItem32.setOCRContents35(oCRContents35);

				audioCovers19.add(audioCoversItem32);
			}
			cover.setAudioCovers19(audioCovers19);
			storiesItem.setCover(cover);

			List<FilesItem> files = new ArrayList<FilesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files.Length"); j++) {
				FilesItem filesItem = new FilesItem();
				filesItem.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OwnerId"));
				filesItem.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProjectName"));
				filesItem.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].DatasetName"));
				filesItem.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectType"));
				filesItem.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectId"));
				filesItem.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].UpdateTime"));
				filesItem.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CreateTime"));
				filesItem.setURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].URI"));
				filesItem.setOSSURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSURI"));
				filesItem.setFilename(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Filename"));
				filesItem.setMediaType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].MediaType"));
				filesItem.setContentType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentType"));
				filesItem.setSize(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Size"));
				filesItem.setFileHash(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileHash"));
				filesItem.setFileModifiedTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileModifiedTime"));
				filesItem.setFileCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileCreateTime"));
				filesItem.setFileAccessTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileAccessTime"));
				filesItem.setProduceTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProduceTime"));
				filesItem.setLatLong(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].LatLong"));
				filesItem.setTimezone(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Timezone"));
				filesItem.setTravelClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].TravelClusterId"));
				filesItem.setOrientation(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Orientation"));
				filesItem.setFigureCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FigureCount"));
				filesItem.setTitle(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Title"));
				filesItem.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageWidth"));
				filesItem.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageHeight"));
				filesItem.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].EXIF"));
				filesItem.setVideoWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoWidth"));
				filesItem.setVideoHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoHeight"));
				filesItem.setArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Artist"));
				filesItem.setAlbumArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AlbumArtist"));
				filesItem.setComposer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Composer"));
				filesItem.setPerformer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Performer"));
				filesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Language"));
				filesItem.setAlbum(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Album"));
				filesItem.setDocumentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].DocumentLanguage"));
				filesItem.setPageCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].PageCount"));
				filesItem.setDocumentContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].DocumentContent"));
				filesItem.setETag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ETag"));
				filesItem.setCacheControl(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CacheControl"));
				filesItem.setContentDisposition(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentDisposition"));
				filesItem.setContentEncoding(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentEncoding"));
				filesItem.setContentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentLanguage"));
				filesItem.setAccessControlAllowOrigin(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AccessControlAllowOrigin"));
				filesItem.setAccessControlRequestMethod(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AccessControlRequestMethod"));
				filesItem.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryptionCustomerAlgorithm"));
				filesItem.setServerSideEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryption"));
				filesItem.setServerSideDataEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideDataEncryption"));
				filesItem.setServerSideEncryptionKeyId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryptionKeyId"));
				filesItem.setOSSStorageClass(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSStorageClass"));
				filesItem.setOSSCRC64(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSCRC64"));
				filesItem.setObjectACL(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectACL"));
				filesItem.setContentMd5(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentMd5"));
				filesItem.setOSSUserMeta(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSUserMeta"));
				filesItem.setOSSTaggingCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSTaggingCount"));
				filesItem.setOSSTagging(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSTagging"));
				filesItem.setOSSExpiration(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSExpiration"));
				filesItem.setOSSVersionId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSVersionId"));
				filesItem.setOSSDeleteMarker(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSDeleteMarker"));
				filesItem.setOSSObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSObjectType"));
				filesItem.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CustomId"));
				filesItem.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CustomLabels"));
				filesItem.setStreamCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].StreamCount"));
				filesItem.setProgramCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProgramCount"));
				filesItem.setFormatName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FormatName"));
				filesItem.setFormatLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FormatLongName"));
				filesItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].StartTime"));
				filesItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Bitrate"));
				filesItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Duration"));

				ImageScore imageScore = new ImageScore();
				imageScore.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageScore.OverallQualityScore"));
				filesItem.setImageScore(imageScore);

				List<AddressesItem> addresses = new ArrayList<AddressesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses.Length"); k++) {
					AddressesItem addressesItem = new AddressesItem();
					addressesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Language"));
					addressesItem.setAddressLine(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].AddressLine"));
					addressesItem.setCountry(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Country"));
					addressesItem.setProvince(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Province"));
					addressesItem.setCity(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].City"));
					addressesItem.setDistrict(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].District"));
					addressesItem.setTownship(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Township"));

					addresses.add(addressesItem);
				}
				filesItem.setAddresses(addresses);

				List<FiguresItem> figures = new ArrayList<FiguresItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures.Length"); k++) {
					FiguresItem figuresItem = new FiguresItem();
					figuresItem.setFigureId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureId"));
					figuresItem.setFigureConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureConfidence"));
					figuresItem.setFigureClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureClusterId"));
					figuresItem.setFigureClusterConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureClusterConfidence"));
					figuresItem.setFigureType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureType"));
					figuresItem.setAge(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Age"));
					figuresItem.setAgeSD(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].AgeSD"));
					figuresItem.setGender(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Gender"));
					figuresItem.setGenderConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].GenderConfidence"));
					figuresItem.setEmotion(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Emotion"));
					figuresItem.setEmotionConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].EmotionConfidence"));
					figuresItem.setFaceQuality(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FaceQuality"));
					figuresItem.setMouth(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Mouth"));
					figuresItem.setMouthConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].MouthConfidence"));
					figuresItem.setBeard(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Beard"));
					figuresItem.setBeardConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].BeardConfidence"));
					figuresItem.setHat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Hat"));
					figuresItem.setHatConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HatConfidence"));
					figuresItem.setMask(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Mask"));
					figuresItem.setMaskConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].MaskConfidence"));
					figuresItem.setGlasses(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Glasses"));
					figuresItem.setGlassesConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].GlassesConfidence"));
					figuresItem.setSharpness(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Sharpness"));
					figuresItem.setAttractive(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Attractive"));

					Boundary boundary = new Boundary();
					boundary.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Width"));
					boundary.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Height"));
					boundary.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Left"));
					boundary.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Top"));
					figuresItem.setBoundary(boundary);

					HeadPose headPose = new HeadPose();
					headPose.setPitch(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Pitch"));
					headPose.setRoll(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Roll"));
					headPose.setYaw(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Yaw"));
					figuresItem.setHeadPose(headPose);

					figures.add(figuresItem);
				}
				filesItem.setFigures(figures);

				List<LabelsItem> labels = new ArrayList<LabelsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels.Length"); k++) {
					LabelsItem labelsItem = new LabelsItem();
					labelsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].Language"));
					labelsItem.setLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelName"));
					labelsItem.setLabelLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelLevel"));
					labelsItem.setLabelConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelConfidence"));
					labelsItem.setParentLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].ParentLabelName"));
					labelsItem.setCentricScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].CentricScore"));

					labels.add(labelsItem);
				}
				filesItem.setLabels(labels);

				List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
					croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary1 boundary1 = new Boundary1();
					boundary1.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary1.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary1.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary1.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem.setBoundary1(boundary1);

					croppingSuggestions.add(croppingSuggestionsItem);
				}
				filesItem.setCroppingSuggestions(croppingSuggestions);

				List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem oCRContentsItem = new OCRContentsItem();
					oCRContentsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary2 boundary2 = new Boundary2();
					boundary2.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary2.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary2.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary2.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem.setBoundary2(boundary2);

					oCRContents.add(oCRContentsItem);
				}
				filesItem.setOCRContents(oCRContents);

				List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams.Length"); k++) {
					VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
					videoStreamsItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Index"));
					videoStreamsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Language"));
					videoStreamsItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecName"));
					videoStreamsItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecLongName"));
					videoStreamsItem.setProfile(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Profile"));
					videoStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTimeBase"));
					videoStreamsItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTagString"));
					videoStreamsItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTag"));
					videoStreamsItem.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Width"));
					videoStreamsItem.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Height"));
					videoStreamsItem.setHasBFrames(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].HasBFrames"));
					videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].SampleAspectRatio"));
					videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].DisplayAspectRatio"));
					videoStreamsItem.setPixelFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].PixelFormat"));
					videoStreamsItem.setLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Level"));
					videoStreamsItem.setFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].FrameRate"));
					videoStreamsItem.setAverageFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].AverageFrameRate"));
					videoStreamsItem.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].TimeBase"));
					videoStreamsItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].StartTime"));
					videoStreamsItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Duration"));
					videoStreamsItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Bitrate"));
					videoStreamsItem.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].FrameCount"));
					videoStreamsItem.setRotate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Rotate"));
					videoStreamsItem.setBitDepth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].BitDepth"));
					videoStreamsItem.setColorSpace(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorSpace"));
					videoStreamsItem.setColorRange(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorRange"));
					videoStreamsItem.setColorTransfer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorTransfer"));
					videoStreamsItem.setColorPrimaries(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorPrimaries"));

					videoStreams.add(videoStreamsItem);
				}
				filesItem.setVideoStreams(videoStreams);

				List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles.Length"); k++) {
					SubtitlesItem subtitlesItem = new SubtitlesItem();
					subtitlesItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Index"));
					subtitlesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Language"));
					subtitlesItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecName"));
					subtitlesItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecLongName"));
					subtitlesItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecTagString"));
					subtitlesItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecTag"));
					subtitlesItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].StartTime"));
					subtitlesItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Duration"));
					subtitlesItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Bitrate"));
					subtitlesItem.setContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Content"));
					subtitlesItem.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Width"));
					subtitlesItem.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Height"));

					subtitles.add(subtitlesItem);
				}
				filesItem.setSubtitles(subtitles);

				List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams.Length"); k++) {
					AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
					audioStreamsItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Index"));
					audioStreamsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Language"));
					audioStreamsItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecName"));
					audioStreamsItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecLongName"));
					audioStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTimeBase"));
					audioStreamsItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTagString"));
					audioStreamsItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTag"));
					audioStreamsItem.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].TimeBase"));
					audioStreamsItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].StartTime"));
					audioStreamsItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Duration"));
					audioStreamsItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Bitrate"));
					audioStreamsItem.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].FrameCount"));
					audioStreamsItem.setLyric(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Lyric"));
					audioStreamsItem.setSampleFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].SampleFormat"));
					audioStreamsItem.setSampleRate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].SampleRate"));
					audioStreamsItem.setChannels(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Channels"));
					audioStreamsItem.setChannelLayout(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].ChannelLayout"));

					audioStreams.add(audioStreamsItem);
				}
				filesItem.setAudioStreams(audioStreams);

				List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers.Length"); k++) {
					AudioCoversItem audioCoversItem = new AudioCoversItem();
					audioCoversItem.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageWidth"));
					audioCoversItem.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageHeight"));
					audioCoversItem.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].EXIF"));

					ImageScore3 imageScore3 = new ImageScore3();
					imageScore3.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageScore.OverallQualityScore"));
					audioCoversItem.setImageScore3(imageScore3);

					List<CroppingSuggestionsItem6> croppingSuggestions4 = new ArrayList<CroppingSuggestionsItem6>();
					for (int l = 0; l < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions.Length"); l++) {
						CroppingSuggestionsItem6 croppingSuggestionsItem6 = new CroppingSuggestionsItem6();
						croppingSuggestionsItem6.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].AspectRatio"));
						croppingSuggestionsItem6.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Confidence"));

						Boundary7 boundary7 = new Boundary7();
						boundary7.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Width"));
						boundary7.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Height"));
						boundary7.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Left"));
						boundary7.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Top"));
						croppingSuggestionsItem6.setBoundary7(boundary7);

						croppingSuggestions4.add(croppingSuggestionsItem6);
					}
					audioCoversItem.setCroppingSuggestions4(croppingSuggestions4);

					List<OCRContentsItem8> oCRContents5 = new ArrayList<OCRContentsItem8>();
					for (int l = 0; l < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents.Length"); l++) {
						OCRContentsItem8 oCRContentsItem8 = new OCRContentsItem8();
						oCRContentsItem8.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Language"));
						oCRContentsItem8.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Contents"));
						oCRContentsItem8.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Confidence"));

						Boundary9 boundary9 = new Boundary9();
						boundary9.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Width"));
						boundary9.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Height"));
						boundary9.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Left"));
						boundary9.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Top"));
						oCRContentsItem8.setBoundary9(boundary9);

						oCRContents5.add(oCRContentsItem8);
					}
					audioCoversItem.setOCRContents5(oCRContents5);

					audioCovers.add(audioCoversItem);
				}
				filesItem.setAudioCovers(audioCovers);

				files.add(filesItem);
			}
			storiesItem.setFiles(files);

			stories.add(storiesItem);
		}
		queryStoriesResponse.setStories(stories);
	 
	 	return queryStoriesResponse;
	}
}